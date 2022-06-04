package com.sagdievilyas.deli.metcast.service.wind;

import com.sagdievilyas.deli.metcast.entity.Wind;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WindRepository extends JpaRepository<Wind, Long> {
}
