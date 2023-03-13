package lv.acodemy.classroom;

public class Cat {

    private String name;
    private String color;
    private int age;
    private double weight;
    private String breed;
    private String gender;
    private boolean hasFur;

    public Cat(String name, String color, String breed, String gender, boolean hasFur) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.gender = gender;
        this.hasFur = hasFur;
    }

    //private int Max_Enery = 5;
    private int currentEnergy = 5;



    public Cat(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void speak (){
        System.out.println("Mjau");
    }

    public void feed(){
        System.out.println("Ņjam,njam");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", breed='" + breed + '\'' +
                ", gender='" + gender + '\'' +
                ", hasFur=" + hasFur +
                '}';
    }

    public boolean getAWeight() {
        return false;
    }
}

