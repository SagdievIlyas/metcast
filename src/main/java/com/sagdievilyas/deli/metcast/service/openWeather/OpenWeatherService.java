package com.sagdievilyas.deli.metcast.service.openWeather;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor

@Service
public class OpenWeatherService {
    private final OpenWeatherClient openWeatherClient;
}
