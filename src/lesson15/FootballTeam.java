package lesson15;

import java.util.Objects;

public class FootballTeam {
    private String name;

    public FootballTeam() {

    }

    public FootballTeam(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public FootballTeam setName(String name) {
        this.name = name;

        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FootballTeam)) return false;
        FootballTeam that = (FootballTeam) o;
        return Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return name;
    }
}