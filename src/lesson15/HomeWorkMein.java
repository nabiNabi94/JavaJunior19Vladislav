package lesson15;

import java.util.HashMap;

public class HomeWorkMein {
    public static void main(String[] args) {
        FootballTable footballTable = new FootballTable();

        footballTable.addTeam("Реал",10);
        footballTable.addTeam("Цска",6);
        footballTable.addTeam("Арсенал",7);
        footballTable.addTeam("Ювентус",9);
        footballTable.addPointToTeam("Реал",3);
        footballTable.addPointToTeam("Цска",1);
        footballTable.addPointToTeam("Спартак",1);

        footballTable.printAllTeam();

    }
}
