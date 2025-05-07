package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Entity2;
import com.example.demo.repository.Entity2Repository;

import java.util.List;
import java.util.Optional;

@Service
public class Entity2Service {

    @Autowired
    private Entity2Repository entity2Repository;

    public List<Entity2> findAll() {
        return entity2Repository.findAll();
    }

    public Optional<Entity2> findById(Long id) {
        return entity2Repository.findById(id);
    }

    public Entity2 save(Entity2 entity2) {
        return entity2Repository.save(entity2);
    }

    public void deleteById(Long id) {
        entity2Repository.deleteById(id);
    }

    public List<Entity2> findByEntity1Name(String name) {
        return entity2Repository.findByEntity1Name(name);
    }
}