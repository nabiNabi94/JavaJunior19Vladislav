package lesson1;

public class MySecondProgramm {
    public static void main(String[] args) {
        double shirinaRoom = 9.5;
        double dlinnaRoom = 5;

        double shirinaStola = 4;
        double dlinnaStola = 2.4;

        double ploshadRoom = shirinaRoom * dlinnaRoom;
        double ploshadStola = shirinaStola * dlinnaStola;
        double tablesToRoomInsert = ploshadRoom / ploshadStola;
        System.out.println("Столов влезет в комнату " + tablesToRoomInsert);



    }
}
