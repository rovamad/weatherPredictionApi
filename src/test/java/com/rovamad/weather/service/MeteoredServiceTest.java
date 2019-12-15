package com.rovamad.weather.service;

import com.rovamad.weather.settings.PropertiesConfigs;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class MeteoredServiceTest {

    @InjectMocks
    MeteoredService service;

    @Mock
    PropertiesConfigs properties;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getPredictionInLocationTest() {
        when(properties.getEndpoint()).thenReturn("http://api.tiempo.com/index.php");
        when(properties.getLang()).thenReturn("es");
        when(properties.getApiKey()).thenReturn("1k94hqd1gvgv");

        assertThat(service.getWeatherPrediction("18578")).isNotNull();
    }

    @Test
    public void getPredictionInLocationTest_ConditionalLocacationIdFail() {
        assertThat(service.getWeatherPrediction("abc"))
                .isEqualTo("{\"success\":false,\"message\":\"[getWeatherPrediction] - Wrong format for Location ID, integer number is required.\"}");
    }
}
