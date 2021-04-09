package lesson13;

public class Dog implements ZooAnimal{

    @Override
    public void voice() {
        System.out.println("Гав гав");
    }

    @Override
    public void jump() {
        System.out.println("Собака прыгает");
    }

    @Override
    public void run() {
        System.out.println("Собака бегает");
    }

}
