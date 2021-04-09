package lesson15;

import java.util.HashMap;

public class Recipe {
    HashMap<String, Integer> ingredients = new HashMap<>();
    private String name;
    private int time;

    public Recipe(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public HashMap<String, Integer> getIngredients() {
        return ingredients;
    }

    public void setIngredients(HashMap<String, Integer> ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngredients(String product, Integer weight) {
        if (ingredients.containsKey(product)) {
            int currentWeight = ingredients.get(product);
            ingredients.put(product, weight + currentWeight);
        } else {
            ingredients.put(product, weight);
        }
    }

    public void printAllIngredients() {
        for (String key : ingredients.keySet()) {
            System.out.println(key + " - " + ingredients.get(key));
        }
    }


}
