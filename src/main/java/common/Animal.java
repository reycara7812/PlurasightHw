package com.monotonic.collections.common;


class Animal implements Comparable<Animal> {
    private String name;
    private String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public int compareTo(Animal otherAnimal) {
        // Compares name
        return this.name.compareTo(otherAnimal.name);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Species: " + species;
    }
}