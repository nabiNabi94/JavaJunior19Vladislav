package independentWork;

import java.util.HashMap;
import java.util.Map;

public class Table {
  private HashMap<Team,Integer> table = new HashMap<>();
         Team team = new Team();

    public Table() {
    }

    public HashMap<Team, Integer> getTable() {
        return table;
    }

    public void setTable(HashMap<Team, Integer> table) {
        this.table = table;
    }




    public Table(HashMap<Team, Integer> table) {
        this.table = table;
    }
    public void addTeamAndPoints (Team team, Integer points){
        if (table.containsKey(team)){
            int currentPoints = table.get(team);
            table.put(team, points + currentPoints);

        }else {
            table.put(team, points);
        }

    }
    public void printToWinner (){
        Map.Entry<Team, Integer> maxEntry = null;
        for (Map.Entry<Team, Integer> entry : table.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }
        Team maxKey = maxEntry.getKey();
        System.out.println("Победитель" + " - " + maxKey);
    }



    public void printTable(){
        for (Team t: table.keySet()){
            System.out.println(t);
        }
        for (Team team: table.keySet()){
            System.out.println(team + " - " + table.get(team));

        }
    }

    @Override
    public String toString() {
        return "Table{" +
                "table=" + table +
                '}';
    }
}
