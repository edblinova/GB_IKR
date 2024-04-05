package com.blinovaed.registry.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

/**
 * Описывает абстрактное животное
 */
public abstract class AbstractAnimal {
    private static int counter;
    private final int id = ++counter;

    private AnimalGenius animalGenius;

    /**
     * Имя животного
     */
    private String name;

    /**
     * Дата рождения жиотного
     */
    private LocalDate birth_date;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getbirth_date() {
        return birth_date;
    }

    public void setbirth_date(LocalDate birth_date) {
        this.birth_date = birth_date;
    }

    public AnimalGenius getAnimalGenius() {
        return animalGenius;
    }

    public void setAnimalGenius(AnimalGenius animalGenius) {
        this.animalGenius = animalGenius;
    }

    public AbstractAnimal(String name, LocalDate birth_date) {
        this.name = name;
        this.birth_date = birth_date;
    }

    public String getBurthDateAsString() {
        return String.format("%02d-%02d-%4d", birth_date.getDayOfMonth(), birth_date.getMonthValue(),
                birth_date.getYear());
    }

    /**
     * Возвращает возраст живионого в месяцах
     * @return возвраст
     */
    public int getAge() {
        int years = Period.between(birth_date, LocalDate.now()).getYears();
        int months = Period.between(birth_date, LocalDate.now()).getMonths();
        return years * 12 + months;
    }

    @Override
    public String toString() {
        return "AbstractAnimal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
