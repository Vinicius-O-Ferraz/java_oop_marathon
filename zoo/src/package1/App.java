package package1;

import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Animal[] animals = new Animal[100];
        Scanner sc = new Scanner(System.in);

        int controller = 1 ;
        while(controller!=0){
            menu();
            controller = sc.nextInt();

            if (controller==1){
                menuCommand1();
                int command = sc.nextInt();

                if (command==0){controller = 0;}

                else if (command==1){
                    Animal animal = Animal.createAnimal(sc);
                }

                else if (command==2){}

                else if (command==3){}

                else if (command==4){}

                else if (command==5){}

                else if (command==6){}

            }

            else if (controller==2){
                System.out.println("Reading animais");
                for (int i = 0; i < animals.length; i++) {
                    System.out.println(animals[i]);
                }
            }

            else if (controller==3){
                System.out.println("Updating animals");
            }

            else if (controller==4){
                System.out.println("Deleting animais");
            }
        }
        sc.close();
        System.out.println("End of program");
    }

    public static void menu(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Welcome to the Zoo Menu");
        System.out.println("1. Create Animal");
        System.out.println("2. Reading Animal");
        System.out.println("3. Updating Animal");
        System.out.println("4. Deleting Animal");
        System.out.println("0. Exit");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    }

    public static void menuCommand1(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("To add the animal, first inform it's type");
        System.out.println("1. Create Animal");
        System.out.println("2. Create Vertebrate");
        System.out.println("3. Create Invertebrate");
        System.out.println("4. Create Mammal");
        System.out.println("5. Create LandAnimals");
        System.out.println("6. Create LandAnimals");
        System.out.println("0. Exit");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    }
}

