package com.blinovaed.registry.model;

import java.util.Objects;

/**
 * Команда, выполняемая животным
 * @param name команда
 */
public record Skill(String name) {
    public Skill(String name) {
        this(name, null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skill skill = (Skill) o;
        return name.equals(skill.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
