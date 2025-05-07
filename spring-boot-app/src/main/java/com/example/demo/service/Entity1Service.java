package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Entity1;
import com.example.demo.repository.Entity1Repository;

import java.util.List;
import java.util.Optional;

@Service
public class Entity1Service {

    @Autowired
    private Entity1Repository entity1Repository;

    public List<Entity1> findAll() {
        return entity1Repository.findAll();
    }

    public Optional<Entity1> findById(Long id) {
        return entity1Repository.findById(id);
    }

    public Entity1 save(Entity1 entity1) {
        return entity1Repository.save(entity1);
    }

    public void deleteById(Long id) {
        entity1Repository.deleteById(id);
    }
}