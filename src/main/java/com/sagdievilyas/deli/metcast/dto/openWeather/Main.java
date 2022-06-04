package com.sagdievilyas.deli.metcast.dto.openWeather;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Main {
    private BigDecimal temp;
    private BigDecimal feels_like;
    private BigDecimal temp_min;
    private BigDecimal temp_max;
    private Integer pressure;
    private Integer humidity;
}
