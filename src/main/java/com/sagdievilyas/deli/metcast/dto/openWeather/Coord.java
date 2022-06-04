package com.sagdievilyas.deli.metcast.dto.openWeather;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Coord {
    BigDecimal lon;
    BigDecimal lat;
}
