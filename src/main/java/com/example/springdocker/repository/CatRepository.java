package com.example.springdocker.repository;

/**
 * Created by: Anton Rolin
 * Date: 17/05/2021
 * Time: 14:46
 * Project: springdocker
 * Copyright: MIT
 */
import com.example.springdocker.model.Cat;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatRepository extends MongoRepository<Cat, String> {

    List<Cat> findCatByCuddly(boolean cuddly);
}
