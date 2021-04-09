package lesson15;

import java.util.HashMap;

public class Fridge {
    private HashMap<String, Integer> products = new HashMap<>();

    public void addProduct(String product, Integer weight) {
        if (products.containsKey(product)) {
            int currentWeight = products.get(product);
            products.put(product, weight + currentWeight);
        } else {
            products.put(product, weight);
        }
    }

    public void printAllProduct() {
        for (String key : products.keySet()) {
            System.out.println(key + " - " + products.get(key));
        }
    }

    public void getProduct(String product, int weight) {
        if (!products.containsKey(product)) {
            System.out.println("Такого продукта в холодильнике нет!");
            return;
        }
        if (products.get(product) == weight) {
            products.remove(product);
            return;
        }
        if (products.get(product) < weight) {
            System.out.println("Вы хотите достать больше чем есть в холодильнике");
            return;
        }
        products.put(product, products.get(product) - weight);
    }

    public void canCookDish(Recipe recipe ) {
        for (String ingredients : recipe.getIngredients().keySet()) {
            if (!products.containsKey(ingredients) ) {
                System.out.println("Нет ингридиентов " + ingredients + " колличество "
                        + recipe.getIngredients().get(ingredients));
                return;
            }
        }
        for (String ingredient : recipe.getIngredients().keySet()) {
            if (products.get(ingredient) < recipe.getIngredients().get(ingredient)) {
                System.out.println("Не хватает " + ingredient + ", требуется больше чем есть ");
                return;
            }
        }
        System.out.println("Можем приготовить такое блюдо ");
    }
}
