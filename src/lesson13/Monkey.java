package lesson13;

public class Monkey implements ZooAnimal {

    @Override
    public void voice() {
        System.out.println("yaaaaaawweww");
    }

    @Override
    public void jump() {
        System.out.println("Обезьяна прыгает");
    }

    @Override
    public void run() {
        System.out.println("Обезьяна бегает");
    }
}
