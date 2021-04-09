package lesson10;

import java.util.Objects;

public class Animal {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return getAge() == animal.getAge();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge());
    }

    public void voice (){
        System.out.println("Животное кричит");



    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                '}';
    }


}
