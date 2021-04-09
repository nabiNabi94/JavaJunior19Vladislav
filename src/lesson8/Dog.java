package lesson8;

public class Dog {
    private  int age;
    private String name;
    private String paroda;

    public void setName (String name){
        this.name = name;

    }
    public void setAge (int age){
        this.age = age;


    }
    public void setParoda (String paroda){
        this.paroda = paroda;
    }
    public void printAbout(){
        System.out.println("Меня зовут " + name + " мне " + age + "лет, и я " + paroda + " пароды ");
    }


}
