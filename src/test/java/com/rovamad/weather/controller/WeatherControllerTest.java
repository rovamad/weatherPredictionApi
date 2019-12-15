package com.rovamad.weather.controller;

import com.rovamad.weather.service.MeteoredService;
import com.rovamad.weather.service.MeteoredServiceTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WeatherControllerTest {

    @InjectMocks
    WeatherController controller;

    @Mock
    MeteoredService service;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getPredictionInLocationTest() {
        when(service.getWeatherPrediction(ArgumentMatchers.anyString())).thenReturn("");

        assertThat(controller.getPredictionInLocation("18578")).isNotNull();
    }

    @Test
    public void pingTest() {
        Assert.assertEquals("success","{\"success\":true,\"message\":\"Ping success\"}", controller.ping());
    }
}
