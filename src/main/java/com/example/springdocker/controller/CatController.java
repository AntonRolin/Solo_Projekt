package com.example.springdocker.controller;

/**
 * Created by: Anton Rolin
 * Date: 17/05/2021
 * Time: 14:46
 * Project: springdocker
 * Copyright: MIT
 */
import com.example.springdocker.model.Cat;
import com.example.springdocker.service.CatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class CatController {
    private final CatService service;

    @GetMapping("/cats")
    public List<Cat> getCats() {
        return service.getCats();
    }

    @PostMapping("/cats")
    public void saveNewCat(@RequestBody Cat cat) {
        service.saveNewCat(cat);
    }

    @GetMapping("/cats/cuddly")
    public List<String> getCuddlyCats() {
        return service.getCuddlyCats();
    }
}
