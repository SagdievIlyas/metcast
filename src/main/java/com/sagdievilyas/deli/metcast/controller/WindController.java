package com.sagdievilyas.deli.metcast.controller;

import com.sagdievilyas.deli.metcast.service.wind.WindService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor

@RestController
@RequestMapping("/api/v1/wind")
public class WindController {

    private final WindService windService;

    @PostMapping("/create")
    public ResponseEntity<?> createWind() { return ResponseEntity.ok(windService.getWind()); }
}
