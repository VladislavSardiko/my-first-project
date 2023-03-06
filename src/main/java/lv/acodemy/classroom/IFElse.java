package lv.acodemy.classroom;

public class IFElse {
    public static void main(String[] args) {

        //IF
        /*
        if(condition0 {
        code to be executed
        }
         */

        boolean x = 5 > 2;
        System.out.println(x);

        if (x) {
            System.out.println("Yes, 5 is more than 2");

            int evenNumber = 20;
            if (evenNumber %2 == 0){
                System.out.println("Number: " + evenNumber + " is even" );

                int Number = 21;
                if (Number %2 == 0) {
                    System.out.println("Number: " + Number + " is even number");
                } else {
                    System.out.println("Number: " + Number + " is NOT even number");
                }



                    boolean isSummer = true;
                    if (isSummer) {
                        System.out.println("Summer months: June, July, August");
                    }


                        int age = 17;
                        if ((age <=17)) {
                            System.out.println("You are not allowed to buy her!");
                        } else if (age<0) {
                            System.out.println("Who are you?");
                        } else {
                            System.out.println("Welcome to our shop");
                        }


                        // IF John = Hello John!
                // Zina = You are not welcome!
                // All others = Text

                String name ="Max";
                        if (name.equals("John")) {
                            System.out.println("Hello Jonh!");
                        } else if (name.equals("Zina")) {
                            System.out.println("You are not welcome");
                        } else {
                            System.out.println("very interesting name!");
                        }

                // IF student1= "John" and student2 = "Max"
                // Print: they will work together
                // &&;

                String student1 = "John";
                String student2 = "Anna";
                if (student1.equals("John")) && student2.equals( "Max")){
                    System.out.println(("They will work together"));

                        }

                    }
                }
            }
        }

