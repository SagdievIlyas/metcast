package com.sagdievilyas.deli.metcast.service.temperature;

import com.sagdievilyas.deli.metcast.dto.OpenWeatherResponse;
import com.sagdievilyas.deli.metcast.dto.ResponseTemperature;
import com.sagdievilyas.deli.metcast.entity.Temperature;
import com.sagdievilyas.deli.metcast.service.openWeather.OpenWeatherClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.TimeZone;


@RequiredArgsConstructor

@Service
public class TemperatureService {

    @Value("${latitude}")
    private String latitude;

    @Value("${longitude}")
    private String longitude;

    @Value("${appid}")
    private String appid;

    private final TemperatureRepository temperatureRepository;
    private final OpenWeatherClient openWeatherClient;

    public ResponseTemperature getTemperature() {
        OpenWeatherResponse response = openWeatherClient.getWeather(appid, latitude, longitude);
        createTemperature(response);

        return new ResponseTemperature(response.getMain().getTemp());
    }

    @Transactional
    public void createTemperature(OpenWeatherResponse response) {
        Temperature temperature = Temperature.builder()
                .temperature(response.getMain().getTemp())
                .latitude(response.getCoord().getLat())
                .longitude(response.getCoord().getLon())
                .timezone(response.getName())
                .weatherDatetime(LocalDateTime.ofInstant(Instant.ofEpochSecond(response.getDt()), TimeZone.getDefault().toZoneId()))
                .requestDatetime(LocalDateTime.now())
                .build();

        temperatureRepository.save(temperature);
    }


}
