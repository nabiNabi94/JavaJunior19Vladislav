package lesson15;

import java.util.HashMap;

public class FootballTable {
    private HashMap<String, Integer> teams = new HashMap<>();

    public FootballTable() {
    }

    public FootballTable(HashMap<String, Integer> teams) {
        this.teams = teams;
    }

    public void addTeam(String team, Integer points) {
        if (teams.containsKey(team)) {
            int currentPoints = teams.get(team);
            teams.put(team, points + currentPoints);
        } else {
            teams.put(team, points);
        }
    }

    public void addPointToTeam(String team, Integer points) {
        if (teams.containsKey(team)) {
            int currentPoints = teams.get(team).intValue();
            teams.put(team, points + currentPoints);
        }
    }

   // public void printToWinner() {

        //      for (String win : teams.keySet()) {
        //          if (){
        //          }
        //      }
        //  }


        public void printAllTeam () {
            for (String key : teams.keySet()) {
                System.out.println(key + " - " + teams.get(key));
            }
        }

}

