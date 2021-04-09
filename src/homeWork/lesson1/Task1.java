package homeWork.lesson1;

public class Task1 {
    public static void main(String[] args) {
        int pizzaPrice = 230;
        int gumPrice  = 26;
        double candyPrice = 2.5;
        int money = 1000;

        int amountPizza = money / pizzaPrice;
        int pizzaMoney = pizzaPrice * amountPizza;
        int restMoneyPizza = money - pizzaMoney;

        int amountGum = restMoneyPizza / gumPrice;
        int gumMoney = gumPrice * amountGum;
        int restMoneyGum = restMoneyPizza - gumMoney;

        int amountCandy = (int) (restMoneyGum / candyPrice);
        int candyMoney = (int) (candyPrice * amountCandy);
        int restMoneyCandy = restMoneyGum - candyMoney;

        System.out.println("На эти деньги мы можем купить: " );
        System.out.println("Пиццы " + amountPizza);
        System.out.println("Жвачка " + amountGum);
        System.out.println("Конфеты " + amountCandy);
        System.out.println("Здача с магазина " + restMoneyCandy);




    }
}
