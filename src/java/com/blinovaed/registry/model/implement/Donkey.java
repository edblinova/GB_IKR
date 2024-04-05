package com.blinovaed.registry.model.implement;

import com.blinovaed.registry.model.AbstractPackAnimal;
import com.blinovaed.registry.model.AnimalGenius;

import java.time.LocalDate;

public class Donkey extends AbstractPackAnimal {
    public Donkey(String name, LocalDate birth_date) {
        super(name, birth_date);
        setAnimalGenius(AnimalGenius.DONKEY);
    }
}
