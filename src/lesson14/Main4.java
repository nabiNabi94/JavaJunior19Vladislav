package lesson14;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main4 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(2.9,1000,10);
        Coin coin2 = new Coin(2.9,1000,10);

        Coin coin3 = new Coin(3.9,2500,15);

        Coin coin4 = new Coin(2.8,2000,50);
        Coin coin5 = new Coin(2.3,3000,20);

      //  HashSet<Coin> coins = new HashSet<>();
        LinkedHashSet<Coin> coins = new LinkedHashSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);

        for (Coin coin: coins){
            System.out.println(coin);
        }

    }
}
