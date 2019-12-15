package com.rovamad.weather.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Forecast {
    private String day;
    private String maxTemp;
    private String minTemp;
    private String definition;
}
