package lesson12;

import java.util.Scanner;

public class Dealer extends Player {

    @Override
    public boolean areYouDealer() {

        return true;
    }

    @Override
    public void printHand() {
        System.out.println("Карты дилера");
        for (Card card : hand) {
            System.out.println(card);
        }
        System.out.println("/---------");
    }

    @Override
    public boolean needsCard() {
        System.out.println("Вам нужна еще одна карта? (да / нет)");
        if (valueHand() <= 17) {
            System.out.println("да");
            return true;
        } else {
            System.out.println("нет");
            return false;
        }
    }
}
