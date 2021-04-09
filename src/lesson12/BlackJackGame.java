package lesson12;
import java.util.ArrayList;

public class BlackJackGame {
    private ArrayList<Player> players = new ArrayList<>();
    private Koloda koloda = new Koloda();

    public void addPlayerToGame(Player player) {
        players.add(player);
    }

    public void dealOfCards() {
        for (Player player : players) {
            player.addCardToHand(koloda.randomCard());
            player.addCardToHand(koloda.randomCard());
        }
    }


    public void nextDealOfCards() {
        for (Player player : players) {
            player.printHand();
            while (player.needsCard()) {
                player.addCardToHand(koloda.randomCard());
                player.printHand();
            }
        }
    }

    public void winGames() {
        int win = 0;
        for (int j = 0;j < players.size();j++){
            if (players.get(j).areYouDealer()){
                win = players.get(j).valueHand();
            }
        }

        for (int i = 0; i < players.size(); i++) {

            if (players.get(i).valueHand() > 21) {
                System.out.println("Игрок проиграл");
            } else if (players.get(i).valueHand() == 21) {
                System.out.println("Игрок победил");
            }
            else if (players.get(i).valueHand() < win && players.get(i).valueHand() >= 21 && win > 21){
                System.out.println("Победил игрок");
            }
            else if (players.get(i).valueHand() > win && players.get(i).valueHand() > 21 && win > 21){
                System.out.println("Победил диллер");
            }
        }
    }
    public void printWinner (){
        for (Player player: players){
            if (player.valueHand() > 21){

            }
        }
    }


}