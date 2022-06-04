package com.sagdievilyas.deli.metcast.controller;

import com.sagdievilyas.deli.metcast.service.temperature.TemperatureService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor

@RestController
@RequestMapping("/api/v1/temperature")
public class TemperatureController {

    private final TemperatureService temperatureService;

    @PostMapping("/create")
    public ResponseEntity<?> createTemperature () {
        return ResponseEntity.ok(temperatureService.getTemperature());
    }
}
