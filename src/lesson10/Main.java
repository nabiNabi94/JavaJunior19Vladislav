package lesson10;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setAge(2);
        dog.voice();

        Dog dog1 = new Dog();
        dog1.setAge(2);


        System.out.println(dog.equals(dog1));

        System.out.println(dog);

    }
}
