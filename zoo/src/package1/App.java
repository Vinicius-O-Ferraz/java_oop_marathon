package package1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        List<Animal> animals = new ArrayList<>();
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
                    Scanner scanner = new Scanner(System.in);
                    Animal animal = Animal.createAnimal(scanner);
                    animals.add(animal);
                }

                else if (command==2){
                    Scanner scanner = new Scanner(System.in);
                    Animal animal = Animal.createAnimal(scanner);
                    animals.add(animal);
                }

                else if (command==3){
                    Scanner scanner = new Scanner(System.in);
                    Animal animal = Animal.createAnimal(scanner);
                    animals.add(animal);
                }

                else if (command==4){
                    Scanner scanner = new Scanner(System.in);
                    Animal animal = Animal.createAnimal(scanner);
                    animals.add(animal);
                }

                else if (command==5){
                    Scanner scanner = new Scanner(System.in);
                    Animal animal = Animal.createAnimal(scanner);
                    animals.add(animal);
                }

                else if (command==6){
                    Scanner scanner = new Scanner(System.in);
                    Animal animal = Animal.createAnimal(scanner);
                    animals.add(animal);
                }

            }

            else if (controller==2){
                System.out.println("Reading animais");
                for (Animal animal : animals) {
                    animal.info();
                    System.out.println();
                }
            }

            else if (controller == 3) {
                System.out.println("Updating animals");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the animal name which you want to update");
                String name = scanner.nextLine();

                boolean found = false; // Flag para verificar se o animal foi encontrado
                for (Animal animal : animals) {
                    if (animal.getAnimal_name().equals(name)) { // Corrigido para usar .equals
                        System.out.println("Updating the following animal:");
                        animal.info(); // Mostra as informações do animal a ser atualizado

                        // Chama o método para atualizar o animal
                        animal.updateAnimal(scanner);
                        found = true;
                        break; // Sai do loop após encontrar e atualizar
                    }
                }

                if (!found) {
                    System.out.println("Animal not found.");
                }
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

