package lesson10;

public class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("Гавкать");
    }

    @Override
    public String toString() {
        return "Собака: " + this.getAge() + "года";
    }
}
