package com.sagdievilyas.deli.metcast.dto.openWeather;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Weather {
    private Long id;
    private String main;
    private String description;
    private String icon;
}
