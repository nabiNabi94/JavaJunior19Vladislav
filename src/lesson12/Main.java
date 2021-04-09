package lesson12;

public class Main {
    public static void main(String[] args) {


        Player player = new Player();
        Dealer dealer = new Dealer();

        BlackJackGame game = new BlackJackGame();
        game.addPlayerToGame(player);
        game.addPlayerToGame(dealer);


        game.dealOfCards();
        game.nextDealOfCards();
        player.valueHand();

        dealer.valueHand();
        System.out.println(player.valueHand());
        game.winGames();







    }
}
