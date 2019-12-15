package com.rovamad.weather.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Location {
    private String name;
    private List<Forecast> forecast;
}
