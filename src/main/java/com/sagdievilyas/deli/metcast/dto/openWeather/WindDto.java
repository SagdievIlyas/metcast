package com.sagdievilyas.deli.metcast.dto.openWeather;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class WindDto {
    private BigDecimal speed;
    private Integer deg;
}
