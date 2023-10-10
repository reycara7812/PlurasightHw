package com.monotonic.collections.common;

import java.util.*;

    public class AnimalTest {
        public static void main(String[] args) {
            // HashSet to store unique animals
            Set<String> animalHashSet = new HashSet<>();
            animalHashSet.add("Lion");
            animalHashSet.add("Elephant");
            animalHashSet.add("Giraffe");
            animalHashSet.add("Lion"); // will be ignored

            // ArrayList to store a list of animals
            List<String> animalArrayList = new ArrayList<>();
            animalArrayList.add("Tiger");
            animalArrayList.add("Monkey");
            animalArrayList.add("Elephant");

            // Hashmap to associate animals with their characteristics
            Map<String, String> animalHashMap = new HashMap<>();
            animalHashMap.put("Lion", "Carnivore");
            animalHashMap.put("Elephant", "Herbivore");
            animalHashMap.put("Giraffe", "Herbivore");

            // Desplaying the contents of the collections
            System.out.println("HashSet of Animals:");
            for (String animal : animalHashSet) {
                System.out.println(animal);
            }

            System.out.println("\nArrayList of Animals:");
            for (String animal : animalArrayList) {
                System.out.println(animal);
            }

            System.out.println("\nHashMap of Animals and Their Characteristics:");
            for (Map.Entry<String, String> entry : animalHashMap.entrySet()) {
                System.out.println("Animal: " + entry.getKey() + ", Characteristic: " + entry.getValue());
            }
        }
    }

