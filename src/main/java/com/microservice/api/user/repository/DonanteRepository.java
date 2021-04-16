package com.microservice.api.user.repository;

import com.microservice.api.user.model.Donante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonanteRepository extends JpaRepository<Donante, Integer> {
}
