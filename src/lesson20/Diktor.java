package lesson20;

public class Diktor {
    public static void main(String[] args) {
        System.out.println("Конерт начался!");
        Voice1 voice1 = new Voice1();
        Voice2 voice2 = new Voice2();

        voice2.setDaemon(true);

        voice1.start();
        voice2.start();

        while (voice1.isAlive()){

        }
        System.out.println("Концерт закончен!");

    }
}
