package com.blinovaed.registry.model;

/**
 * Перечисление, описывающее Род животного
 */
public enum AnimalGenius {
    DOG ("Собака"),
    CAT ("Кошка"),
    HAMSTER ("Хомяк"),
    HORSE ("Лошадь"),
    CAMEL ("Верблюд"),
    DONKEY ("Осёл");

    private String title;

    /**
     * Список выполняемых команд животного
     */
    private List<Skill> animalSkills;

    public List<Skill> getAnimalSkills() {
        return animalSkills;
    }

    AnimalGenius(String title) {
        this.title = title;
        animalSkills = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    /**
     * Добавляет новую команду
     * @param newSkill команды
     * @return true в случае успеха или false - в противном
     */
    public boolean learnSkill(Skill newSkill) {
        if (animalSkills.contains(newSkill)){
            return false;
        }
        animalSkills.add(newSkill);
        return true;
    }
}
