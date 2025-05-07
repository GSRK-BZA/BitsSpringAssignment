package com.example.demo.controller;

import com.example.demo.entity.Entity1;
import com.example.demo.service.Entity1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/entity1")
public class Entity1Controller {

    @Autowired
    private Entity1Service entity1Service;

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("entity1", new Entity1());
        return "entity1/create";
    }

    @PostMapping("/create")
    public String createEntity1(@ModelAttribute Entity1 entity1) {
        entity1Service.save(entity1);
        return "redirect:/entity1/read";
    }

    @GetMapping("/read")
    public String readEntity1(Model model) {
        List<Entity1> entity1List = entity1Service.findAll();
        model.addAttribute("entity1List", entity1List);
        return "entity1/read";
    }

    @GetMapping("/update/{id}")
    public String showUpdateForm(@PathVariable Long id, Model model) {
        Entity1 entity1 = entity1Service.findById(id);
        model.addAttribute("entity1", entity1);
        return "entity1/update";
    }

    @PostMapping("/update")
    public String updateEntity1(@ModelAttribute Entity1 entity1) {
        entity1Service.save(entity1);
        return "redirect:/entity1/read";
    }
}