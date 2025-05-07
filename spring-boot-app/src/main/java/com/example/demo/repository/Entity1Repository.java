package com.example.demo.repository;

import com.example.demo.entity.Entity1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Entity1Repository extends JpaRepository<Entity1, Long> {
    // Custom query methods can be defined here if needed
}