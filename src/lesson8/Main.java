package lesson8;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog2 = new Dog();

        dog.setName("Тузик");
        dog2.setName("Барбос");

        dog.setAge(12);
        dog2.setAge(10);

        dog.setParoda("Дворняга");
        dog2.setParoda("Боксер");

        dog2.printAbout();
        dog.printAbout();


    }
}
