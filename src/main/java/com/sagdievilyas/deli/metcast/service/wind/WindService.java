package com.sagdievilyas.deli.metcast.service.wind;

import com.sagdievilyas.deli.metcast.dto.OpenWeatherResponse;
import com.sagdievilyas.deli.metcast.dto.ResponseWind;
import com.sagdievilyas.deli.metcast.entity.Wind;
import com.sagdievilyas.deli.metcast.service.openWeather.OpenWeatherClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.TimeZone;

@RequiredArgsConstructor

@Service
public class WindService {

    @Value("${latitude}")
    private String latitude;

    @Value("${longitude}")
    private String longitude;

    @Value("${appid}")
    private String appid;

    private final OpenWeatherClient openWeatherClient;
    private final WindRepository windRepository;

    public ResponseWind getWind() {
        OpenWeatherResponse response = openWeatherClient.getWeather(appid, latitude, longitude);
        createWind(response);

        return new ResponseWind(response.getWind().getSpeed());

    }

    @Transactional
    public void createWind(OpenWeatherResponse response) {
        Wind wind = Wind.builder()
                .speedMetersPerSeconds(response.getWind().getSpeed())
                .latitude(response.getCoord().getLat())
                .longitude(response.getCoord().getLon())
                .timezone(response.getName())
                .weatherDatetime(LocalDateTime.ofInstant(Instant.ofEpochSecond(response.getDt()), TimeZone.getDefault().toZoneId()))
                .requestDatetime(LocalDateTime.now())
                .build();

        windRepository.save(wind);
    }

}
