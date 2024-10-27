package package1;

import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String[] nomes;
/*        System.out.println("Welcome to the Zoo!");

        Animal lion = new Animal("Lion Alva",0,176.5f,"Carnivore", 'M',new Date());
        lion.info();
        lion.reproduce();*/

        Animal[] animals = new Animal[100];
        Scanner sc = new Scanner(System.in);

        int controller = 1 ;
        while(controller!=0){
            controller = sc.nextInt();
        }
        System.out.println("End of program");
    }
}

