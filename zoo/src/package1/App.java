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
                System.out.println("Creating animals");
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
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    }
}

