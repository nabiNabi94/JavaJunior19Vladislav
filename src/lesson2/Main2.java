package lesson2;

public class Main2 {
    public static void main(String[] args) {
        int tour = 40;
        int saleri = 60;
        int dayTrips = 8;

        if (dayTrips > 7 || tour < saleri) {
            System.out.println(" Поедем ");
        } else {
            System.out.println(" Не поедем ");
        }
    }
}
