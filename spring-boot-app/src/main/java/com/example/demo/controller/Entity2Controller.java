package com.example.demo.controller;

import com.example.demo.entity.Entity2;
import com.example.demo.service.Entity2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/entity2")
public class Entity2Controller {

    @Autowired
    private Entity2Service entity2Service;

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("entity2", new Entity2());
        return "entity2/create";
    }

    @PostMapping("/create")
    public String createEntity2(@ModelAttribute Entity2 entity2) {
        entity2Service.save(entity2);
        return "redirect:/entity2/read";
    }

    @GetMapping("/read")
    public String readEntity2(Model model) {
        List<Entity2> entity2List = entity2Service.findAll();
        model.addAttribute("entity2List", entity2List);
        return "entity2/read";
    }

    @GetMapping("/update/{id}")
    public String showUpdateForm(@PathVariable("id") Long id, Model model) {
        Entity2 entity2 = entity2Service.findById(id);
        model.addAttribute("entity2", entity2);
        return "entity2/update";
    }

    @PostMapping("/update")
    public String updateEntity2(@ModelAttribute Entity2 entity2) {
        entity2Service.save(entity2);
        return "redirect:/entity2/read";
    }
}