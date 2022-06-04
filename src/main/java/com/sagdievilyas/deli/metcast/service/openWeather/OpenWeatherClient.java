package com.sagdievilyas.deli.metcast.service.openWeather;

import com.sagdievilyas.deli.metcast.dto.OpenWeatherResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@FeignClient(name = "open-weather-client", url = "https://openexchangerates.org")
public interface OpenWeatherClient {

    @GetMapping("/data/2.5/weather")
    OpenWeatherResponse getWeather(
            @RequestParam(value = "appid") String appid,
            @RequestParam(value = "lat") String lat,
            @RequestParam(value = "lon") String lon
            );
}
