package lesson13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Monkey monkey1 = new Monkey();
        Monkey monkey2 = new Monkey();

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        ArrayList<ZooAnimal>  animals = new ArrayList<>();
        animals.add(monkey1);
        animals.add(monkey2);
        animals.add(dog1);
        animals.add(dog2);

        for (ZooAnimal animal : animals){
            animal.voice();
        }




    }

}
