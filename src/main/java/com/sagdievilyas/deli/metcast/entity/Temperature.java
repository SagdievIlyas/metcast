package com.sagdievilyas.deli.metcast.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@SuperBuilder

@Entity
@Table(name = "temperature")
public class Temperature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal temperature;

    private BigDecimal latitude;

    private BigDecimal longitude;

    private String timezone;

    @Column(name = "weather_datetime")
    private LocalDateTime weatherDatetime;

    @Column(name = "request_datetime")
    private LocalDateTime requestDatetime;
}
