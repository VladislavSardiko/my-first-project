package lv.acodemy.classroom;

public class Loops {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        /*

       // for(int i = 0; i < 10; i++)
        // define counter
        // condition
        // increment
         */

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }

        //numbers [0] = 1
        //numbers [1] =2
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        //numbers [0];
        //numbers [1];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
            //numbers [0];
            //numbers [1];

            for (int number : numbers) {
                System.out.println(number);
            }

            String[] names = {"name1", "name2", "name3", "name4", "name5"};
            for (int j = 0; j < names.length; j++) {
                System.out.println(names[j]);
            }
            String[] name = {"name1", "name2", "name3", "name4", "name5"};
            for (int j = 0; j < names.length; j++) {
                if (names[j].equals("name3")) {
                } else {
                    System.out.println(names[j]);
                }
            }

            //do. do while

            /*
            do {
            // code to be executed
            }{while is true)
             */

            int j = 1;
            do {
                System.out.println(i);
                i++;
            } while (j <= 10);
        }

    }

    }

