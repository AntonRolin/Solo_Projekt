package com.example.springdocker.service;

/**
 * Created by: Anton Rolin
 * Date: 17/05/2021
 * Time: 14:46
 * Project: springdocker
 * Copyright: MIT
 */
import com.example.springdocker.model.Cat;
import com.example.springdocker.repository.CatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CatService {
    private final CatRepository repository;

    public List<Cat> getCats() {
        return repository.findAll();
    }

    public void saveNewCat(Cat cat) {
        repository.save(cat);
    }

    public List<String> getCuddlyCats() {
        // hämtar alla Cats som är cuddly
        List<Cat> cuddlyCats = repository.findCatByCuddly(true);

        // returnerar endast Cat namnen i en lista
        return cuddlyCats.stream()
                .map(cat -> cat.getName())
                .collect(Collectors.toList());
    }
}
