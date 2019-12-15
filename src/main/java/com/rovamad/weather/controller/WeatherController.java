package com.rovamad.weather.controller;

import com.rovamad.weather.helper.JSONHelper;
import com.rovamad.weather.helper.MarshallHelper;
import com.rovamad.weather.service.MeteoredService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import static java.lang.Integer.*;

@RestController
@RequestMapping("weatherPrediction")
public class WeatherController {

    @Autowired
    private MeteoredService service;

    @GetMapping(value = "ping", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String ping() {
        return JSONHelper.successMessage("Ping success");
    }

    /**
     * 
     * @return
     */
    @GetMapping(value = "location/{locationId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String getPredictionInLocation(@PathVariable("locationId") String locationId) {
        return service.getWeatherPrediction(locationId);
    }
}
