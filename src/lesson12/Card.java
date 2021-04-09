package lesson12;

public class Card {
    private String name;
    private int value;

    public Card() {
    }

    public Card(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;

        Card card = (Card) o;

        if (getValue() != card.getValue()) return false;
        return getName() != null ? getName().equals(card.getName()) : card.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getValue();
        return result;
    }

    @Override
    public String toString() {
        return name;
    }
}
