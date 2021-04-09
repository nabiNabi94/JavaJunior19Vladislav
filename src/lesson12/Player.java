package lesson12;
import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    protected ArrayList<Card> hand = new ArrayList<>();

    public void addCardToHand(Card card) {
        hand.add(card);
    }

    public boolean areYouDealer() {
        return false;
    }

    public void printHand() {
        System.out.println("/--------- Карты игрока ");
        for (Card card : hand) {
            System.out.println(card);
        }
        System.out.println("/---------");
    }

    public boolean needsCard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вам нужна еще одна карта? (да / нет)");
        String answer = scanner.nextLine();
        if (answer.equals("да")) {
            return true;
        } else {
            return false;
        }
    }
    public int valueHand() {
        int value = 0;
        for (Card card : hand) {
            value = value + card.getValue();
        }
        return value;
    }


}
