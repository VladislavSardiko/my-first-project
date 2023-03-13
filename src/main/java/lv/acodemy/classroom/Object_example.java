package lv.acodemy.classroom;

import java.awt.*;

public class Object_example {
    public static void main(String[] args) {

        Cat barsik = new Cat("Barsik");
        System.out.println(barsik.getAge());
        System.out.println(barsik);

        Cat barsik;
        barsik = new Cat("barsik","Ģray", "unknow", "female", true);

        public void walk(){
            System.out.println("Tap-Tap");

        }
        public void feed() {
            if (energy == 5) {
                System.out.println("I cannot eat anymore!");
            } else {
                energy++;
                System.out.println("Om-nom-nom!");
            }
        }




        barsik.setAge(4);
        System.out.println(barsik);

        barsik.speak();
        barsik.feed();

        System.out.println(barsik.getAWeight());
        System.out.println(barsik);

        barsik.setWeight(8.25);
        System.out.println(barsik);



    }
}
