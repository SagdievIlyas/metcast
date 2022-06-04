package com.sagdievilyas.deli.metcast.dto;

import com.sagdievilyas.deli.metcast.dto.openWeather.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OpenWeatherResponse {
    private Coord coord;
    private Weather weather;
    private String base;
    private Main main;
    private Integer visibility;
    private WindDto wind;
    private Clouds clouds;
    private Long dt;
    private Sys sys;
    private Integer timezone;
    private Long id;
    private String name;
    private Integer cod;
}
