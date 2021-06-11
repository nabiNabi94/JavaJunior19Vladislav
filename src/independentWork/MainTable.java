package independentWork;

import java.util.HashMap;

public class MainTable {
    public static void main(String[] args) {
        Table table =  new Table();
        Team real = new Team("real");
        Team barsa = new Team("barsa");
        Team cska = new Team("cska");


        table.addTeamAndPoints(real,5);
        table.addTeamAndPoints(barsa,10);
        table.addTeamAndPoints(cska,6);
        table.addTeamAndPoints(cska,3);

        table.printTable();
        table.printToWinner();

    }
}
