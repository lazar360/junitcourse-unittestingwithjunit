package com.in28minutes.junit.helper;

import java.util.*;

public class RandomInt {
    public static void main(String[] args) {
        int min = 1;
        int max = 3;
        int sizeRequired = 2;
        List<String> listOfDishesFull = List.of(
                "Poisson et riz",
                "Steak haricots verts",
                "Boudin aux pommes"
        );

        List<String> listOfDishes = new ArrayList<>();
        Random random = new Random();
        Set<Integer> selectedIndices = new HashSet<>();

        while (listOfDishes.size() < sizeRequired) {
            int randomIndex;
            do {
                randomIndex = random.nextInt(max - min + 1) + min - 1;
            } while (selectedIndices.contains(randomIndex));

            selectedIndices.add(randomIndex);
            listOfDishes.add(listOfDishesFull.get(randomIndex));
        }

        for (String dish : listOfDishes) {
            System.out.println("plat : " + dish);
        }
    }
}
