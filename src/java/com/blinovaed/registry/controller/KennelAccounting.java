package com.blinovaed.registry.controller;

import com.blinovaed.registry.model.AbstractAnimal;
import com.blinovaed.registry.model.AnimalGenius;
import com.blinovaed.registry.model.implement.*;
import com.blinovaed.registry.storage.Storage;

import java.time.LocalDate;
import java.util.List;

/**
 * Отвечает за взаимодействие View и Model
 */
public class KennelAccounting {

    private Storage dbKennel;

    public KennelAccounting(Storage dbKennel) {
        this.dbKennel = dbKennel;
    }

    public List<AbstractAnimal> getAnimals() {
        return dbKennel.getAllAnimals();
    }

    public boolean createAnimal(String name, LocalDate birth_date, AnimalGenius animalGenius) {
        AbstractAnimal animal = switch (animalGenius) {
            case CAT -> new Cat(name, birth_date);
            case DOG -> new Dog(name, birth_date);
            case HAMSTER -> new Hamster(name, birth_date);
            case HORSE -> new Horse(name, birth_date);
            case CAMEL -> new Camel(name, birth_date);
            case DONKEY -> new Donkey(name, birth_date);
        };

        return dbKennel.addAnimal(animal);
    }

    public int removeAnimal(AbstractAnimal animal) {
        if (animal == null) return -1;
        return  dbKennel.removeAnimal(animal);
    }
}
