package com.rovamad.weather.service;

import com.rovamad.weather.helper.JSONHelper;
import com.rovamad.weather.helper.MarshallHelper;
import com.rovamad.weather.pojo.Forecast;
import com.rovamad.weather.pojo.Location;
import com.rovamad.weather.settings.PropertiesConfigs;
import generated.Report;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.validator.GenericValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.xml.bind.JAXBException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class MeteoredService {

    @Autowired
    PropertiesConfigs properties;

    public String getWeatherPrediction(String locationId) {

        String error = null;

        if (GenericValidator.isInt(locationId) && !GenericValidator.isBlankOrNull(locationId)) {

            String incomingXMLResponse = callExternalService(locationId);

            if (!GenericValidator.isBlankOrNull(incomingXMLResponse)) {

                try {
                    Report report = MarshallHelper.unmarshall(Report.class, incomingXMLResponse);
                    Location location = sortReport(report);

                    log.info("[getWeatherPrediction] - Information colected correctly.");
                    return MarshallHelper.toJson(location);
                } catch (JAXBException e) {
                    log.error(e.getMessage(), e);
                }
            }
            error = "[getWeatherPrediction] - Something went wrong with the external service.";
            log.error(error);
        } else {
            error = "[getWeatherPrediction] - Wrong format for Location ID, integer number is required.";
            log.error(error);
        }

        return JSONHelper.errorMessage(error);
    }

    String callExternalService(String locationId) {

        log.info("[callExternalService] - Calling Meteored Public Service.");

        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(headers);

        RestTemplate restTemplate = new RestTemplate();
        String url = properties.getEndpoint() + "?api_lang=" + properties.getLang() + "&localidad=" + locationId +
                "&affiliate_id=" + properties.getApiKey();
        ResponseEntity<String> serviceResponse = restTemplate.exchange(
                url,
                HttpMethod.GET,
                entity,
                String.class);

        return serviceResponse.getBody();
    }

    private Location sortReport(Report report) {

        log.info("[sortReport] - Sorting report info.");

        Location location = new Location();
        List<Forecast> forecastList = new ArrayList<>();

        location.setName(report.getLocation().getCity());


        List<Report.Location.Var> var = report.getLocation().getVar();
        for (int i = 0; i <= 6; i++) {
            Forecast forecast = new Forecast();

            forecast.setDay(var.get(4).getData().getForecast().get(i).getValue());
            forecast.setMinTemp(var.get(0).getData().getForecast().get(i).getValue());
            forecast.setMaxTemp(var.get(1).getData().getForecast().get(i).getValue());
            forecast.setDefinition(var.get(5).getData().getForecast().get(i).getValue());

            forecastList.add(forecast);
        }
        location.setForecast(forecastList);

        return location;
    }
}
