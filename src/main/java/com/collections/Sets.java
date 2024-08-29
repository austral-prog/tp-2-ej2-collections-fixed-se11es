package com.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Arrays;

public class Sets {

    private static final Set<String> ALCOHOLS = new HashSet<>(Arrays.asList("whiskey", "whisky", "white rum", "dark rum", "bourbon", "rye", "scotch", "vodka",
            "tequila", "gin", "dry vermouth", "sweet vermouth", "prosecco","aperol", "brandy", "mezcal",
            "triple sec", "coffee liqueur", "almond liqueur", "champagne", "orange curacao", "rum"));

    public static String checkDrinks(String drinkName, List<String> ingredients) {
        for (String ingredient : ingredients) {
            if (ALCOHOLS.contains(ingredient.toLowerCase())) {
                return drinkName + " Cocktail";
            }
        }
        return drinkName + " Mocktail";
    }

    public static void main(String[] args) {
        System.out.println(checkDrinks("Honeydew Cucumber", Arrays.asList("honeydew", "coconut water", "mint leaves", "lime juice", "salt", "english cucumber")));
        // Imprime: Honeydew Cucumber Mocktail

        System.out.println(checkDrinks("Shirley Tonic", Arrays.asList("cinnamon stick", "scotch", "whole cloves", "ginger", "pomegranate juice", "sugar", "club soda")));
        // Imprime: Shirley Tonic Cocktail
    }
}
