package com.java.main.springstarter.v1.repositories;

import com.java.main.springstarter.v1.models.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ITrainerRepository extends JpaRepository<Trainer, UUID> {

}
