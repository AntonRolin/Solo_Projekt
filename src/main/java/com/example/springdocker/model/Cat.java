package com.example.springdocker.model;

/**
 * Created by: Anton Rolin
 * Date: 17/05/2021
 * Time: 14:46
 * Project: springdocker
 * Copyright: MIT
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cat {
    String id;
    String name;
    String breed;
    boolean cuddly;
}
