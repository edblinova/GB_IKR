package com.blinovaed.registry.model;

import java.time.LocalDate;

/**
 * Описывает абстрактное домашнее животное
 */
public abstract class AbstractPet extends AbstractAnimal {
    public AbstractPet(String name, LocalDate birth_date) {
        super(name, birth_date);
    }
}
