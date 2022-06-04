package com.sagdievilyas.deli.metcast.dto.openWeather;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Sys {
    private Integer type;
    private Long id;
    private BigDecimal message;
    private String country;
    private Long sunrise;
    private Long sunset;
}
