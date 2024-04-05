package com.blinovaed.registry.model;

import java.time.LocalDate;


/**
 * Описывает абстрактное вьючное животное
 */
public abstract class AbstractPackAnimal extends AbstractAnimal {
    public static final int DEFAULT_LOAD_CAPACITY = 100;

    /**
     * Грузоподъемность животного, кг
     */
    private  int loadCapacity;


    public AbstractPackAnimal(String name, LocalDate birth_date) {
        super(name, birth_date);
        this.loadCapacity = DEFAULT_LOAD_CAPACITY;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
