package com.example.demo.repository;

import com.example.demo.entity.Entity2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Entity2Repository extends JpaRepository<Entity2, Long> {
    // Custom query methods can be defined here if needed
}