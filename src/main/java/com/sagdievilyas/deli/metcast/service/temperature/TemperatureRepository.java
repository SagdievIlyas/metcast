package com.sagdievilyas.deli.metcast.service.temperature;

import com.sagdievilyas.deli.metcast.entity.Temperature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemperatureRepository extends JpaRepository<Temperature, Long> {
}
