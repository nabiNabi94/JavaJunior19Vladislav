package lesson15;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FootballTable {
    private HashMap<FootballTeam, Integer> teams = new HashMap<>();
    private String nameTable;

    public FootballTable() {

    }

    public FootballTable(String nameTable) {
        this.nameTable = nameTable;
    }

    public void addTeam(FootballTeam footballTeam, Integer points) {
        teams.put(footballTeam, points);

    }

    public void addPointsToTeam(FootballTeam footballTeam) {
        teams.replace(footballTeam, teams.get(footballTeam).intValue() + 1);

    }

    public void printToTable() {
        for (FootballTeam key : teams.keySet()) {
            System.out.println(key + " - " + teams.get(key));
        }

    }

    public void printToWinner() {
        String nameWinner = "";
        int valueWinner = 0;
        for (FootballTeam team : teams.keySet()) {
            if (valueWinner < teams.get(team)) {
                valueWinner = teams.get(team);
                nameWinner = team.getName();

            }
        }
        System.out.println("Победитель - " + nameWinner);
    }
//    public void sortTable (){
//        TreeMap<String,Integer> treeMap = new TreeMap(new );
//
//        System.out.println(treeMap);
//    }



}


