package lesson15;

public class Main {
    public static void main(String[] args) {
        Fridge fridge = new Fridge();
        fridge.addProduct("Слива", 5);
        fridge.addProduct("Яблоко", 4);
        fridge.addProduct("Груша", 9);
        fridge.addProduct("Слива", 2);

       // fridge.printAllProduct();
       // fridge.getProduct("Яблоко",4);
      //  fridge.printAllProduct();

        Recipe recipe = new Recipe("Салат",10);
        recipe.addIngredients("Слива",64);
        recipe.addIngredients("Банана",10);
        recipe.addIngredients("Яблоко",64);
        recipe.printAllIngredients();

        fridge.canCookDish(recipe);

    }


}
