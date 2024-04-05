package com.blinovaed.registry.model.implement;

import com.blinovaed.registry.model.AbstractPet;
import com.blinovaed.registry.model.AnimalGenius;

import java.time.LocalDate;

public class Dog extends AbstractPet {
    public Dog(String name, LocalDate birth_date) {
        super(name, birth_date);
        setAnimalGenius(AnimalGenius.DOG);
    }
}
