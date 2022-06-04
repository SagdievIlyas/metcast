package com.sagdievilyas.deli.metcast.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class ResponseTemperature {
    private BigDecimal value;
}
