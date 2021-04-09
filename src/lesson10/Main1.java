package lesson10;

public class Main1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        Dog dog = new Dog();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();


        Animal[] animals = new Animal[6];
        animals[0] = dog;
        animals[1] = dog1;
        animals[2] = dog2;
        animals[3] = cat;
        animals[4] = cat1;
        animals[5] = cat2;

        for (Animal animal : animals){
            animal.voice(); // проявление полимарфизма !!!!!!!!

        }
        Magazine magazine = new Magazine();
        System.out.println(magazine.getName());



    }

}
