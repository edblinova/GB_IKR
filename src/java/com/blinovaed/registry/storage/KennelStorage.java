package com.blinovaed.registry.storage;

import com.blinovaed.registry.model.AbstractAnimal;
import com.blinovaed.registry.model.AbstractPackAnimal;
import com.blinovaed.registry.model.AbstractPet;
import com.blinovaed.registry.model.AnimalGenius;
import com.blinovaed.registry.model.implement.*;
import com.blinovaed.registry.model.Skill;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Реализация интерфейса Storage
 * Хранилище реализовано на HashMap
 */
public class KennelStorage implements Storage{
    Map<Integer, AbstractAnimal> dbAnimals = new HashMap<>();

    public KennelStorage() {
        init();
    }

    private void init(){
        AnimalGenius.DOG.learnSkill(new Skill("Голос"));
        AnimalGenius.DOG.learnSkill(new Skill("Сидеть"));
        AnimalGenius.DOG.learnSkill(new Skill("Стоять"));
        AnimalGenius.DOG.learnSkill(new Skill("Лежать"));
        AnimalGenius.DOG.learnSkill(new Skill("Апорт"));
        AnimalGenius.DOG.learnSkill(new Skill("Место"));
        AnimalGenius.DOG.learnSkill(new Skill("Кушать"));

        AnimalGenius.CAT.learnSkill(new Skill("Голос"));
        AnimalGenius.CAT.learnSkill(new Skill("Сидеть"));
        AnimalGenius.CAT.learnSkill(new Skill("Стоять"));
        AnimalGenius.CAT.learnSkill(new Skill("Лежать"));
        AnimalGenius.CAT.learnSkill(new Skill("Апорт"));
        AnimalGenius.CAT.learnSkill(new Skill("Место"));
        AnimalGenius.CAT.learnSkill(new Skill("Кушать"));

        AnimalGenius.HAMSTER.learnSkill(new Skill("Сидеть"));
        AnimalGenius.HAMSTER.learnSkill(new Skill("Лежать"));
        AnimalGenius.HAMSTER.learnSkill(new Skill("Кушать"));

        AnimalGenius.HORSE.learnSkill(new Skill("Голос"));
        AnimalGenius.HORSE.learnSkill(new Skill("Стоять"));
        AnimalGenius.HORSE.learnSkill(new Skill("Лежать"));
        AnimalGenius.HORSE.learnSkill(new Skill("Апорт"));
        AnimalGenius.HORSE.learnSkill(new Skill("Место"));
        AnimalGenius.HORSE.learnSkill(new Skill("Кушать"));
        AnimalGenius.HORSE.learnSkill(new Skill("Вперёд"));
        AnimalGenius.HORSE.learnSkill(new Skill("Влево"));
        AnimalGenius.HORSE.learnSkill(new Skill("Вправо"));
        AnimalGenius.HORSE.learnSkill(new Skill("Пятиться"));

        AnimalGenius.CAMEL.learnSkill(new Skill("Стоять"));
        AnimalGenius.CAMEL.learnSkill(new Skill("Место"));
        AnimalGenius.CAMEL.learnSkill(new Skill("Кушать"));
        AnimalGenius.CAMEL.learnSkill(new Skill("Вперёд"));
        AnimalGenius.CAMEL.learnSkill(new Skill("Влево"));
        AnimalGenius.CAMEL.learnSkill(new Skill("Вправо"));
        AnimalGenius.CAMEL.learnSkill(new Skill("Пятиться"));

        AnimalGenius.DONKEY.learnSkill(new Skill("Стоять"));
        AnimalGenius.DONKEY.learnSkill(new Skill("Кушать"));
        AnimalGenius.DONKEY.learnSkill(new Skill("Вперёд"));
        AnimalGenius.DONKEY.learnSkill(new Skill("Влево"));
        AnimalGenius.DONKEY.learnSkill(new Skill("Вправо"));

        AbstractPet dog1 = new Dog("Пёс", LocalDate.of(2015, 9, 1));
        dbAnimals.put(dog.getId(), dog);

        AbstractPet dog2 = new Dog("Рекс", LocalDate.of(1994, 11, 10));
        dbAnimals.put(dog.getId(), dog);

        AbstractPet dog3 = new Dog("Найда", LocalDate.of(1984, 12, 21));
        dbAnimals.put(dog.getId(), dog);

        AbstractPet cat1 = new Cat("Ксюша", LocalDate.of(2014, 05, 25));
        dbAnimals.put(cat.getId(), cat);

        AbstractPet cat2 = new Cat("Муся", LocalDate.of(2010, 03, 30));
        dbAnimals.put(cat.getId(), cat);

        AbstractPet cat3 = new Cat("Барсик", LocalDate.of(2023, 4, 1));
        dbAnimals.put(cat.getId(), cat);

        AbstractPet hamster1 = new Hamster("Роза", LocalDate.of(2003, 5, 1));
        dbAnimals.put(hamster.getId(), hamster);

        AbstractPet hamster2 = new Hamster("Эльза", LocalDate.of(2017, 9, 18));
        dbAnimals.put(hamster.getId(), hamster);

        AbstractPet hamster3 = new Hamster("Рыжик", LocalDate.of(2024, 2, 1));
        dbAnimals.put(hamster.getId(), hamster);

        AbstractPackAnimal horse1 = new Horse("Освинд", LocalDate.of(2013, 1, 1));
        dbAnimals.put(horse.getId(), horse);

        AbstractPackAnimal horse2 = new Horse("Гнедой", LocalDate.of(2018, 10, 5));
        dbAnimals.put(horse.getId(), horse);

        AbstractPackAnimal horse3 = new Horse("Идальго", LocalDate.of(2004, 3, 5));
        dbAnimals.put(horse.getId(), horse);

        AbstractPackAnimal camel1 = new Camel("Горбатый", LocalDate.of(2020, 2, 2));
        dbAnimals.put(camel.getId(), camel);

        AbstractPackAnimal camel2 = new Camel("Плевака", LocalDate.of(2000, 11, 1));
        dbAnimals.put(camel.getId(), camel);

        AbstractPackAnimal camel3 = new Camel("Бонго", LocalDate.of(2021, 6, 15));
        dbAnimals.put(camel.getId(), camel);

        AbstractPackAnimal donkey1 = new Donkey("Янки", LocalDate.of(2022, 12, 24));
        dbAnimals.put(donkey.getId(), donkey);

        AbstractPackAnimal donkey2 = new Donkey("Иа-иа", LocalDate.of(1969, 7, 19));
        dbAnimals.put(donkey.getId(), donkey);

        AbstractPackAnimal donkey3 = new Donkey("Мокко", LocalDate.of(2023, 1, 20));
        dbAnimals.put(donkey.getId(), donkey);
    }
    @Override
    public List<AbstractAnimal> getAllAnimals() {
        List<AbstractAnimal> result = new ArrayList<>();
        for (AbstractAnimal animal: dbAnimals.values()) {
            result.add(animal);
        }
        return result;
    }

    @Override
    public AbstractAnimal getAnimalById(int animalId) {
        return dbAnimals.getOrDefault(animalId, null);
    }

    @Override
    public boolean addAnimal(AbstractAnimal animal) {
        if (dbAnimals.containsKey(animal.getId())) {return false;}
        dbAnimals.put(animal.getId(), animal);
        return true;
    }

    @Override
    public int removeAnimal(AbstractAnimal animal) {
        if (!dbAnimals.containsKey(animal.getId())) {
            return -1;
        }
        AbstractAnimal removed = dbAnimals.remove(animal.getId());
        return removed.getId();
    }
}
