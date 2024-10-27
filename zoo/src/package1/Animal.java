package package1;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Animal {
    // Attributes
    private Date birth_Date;  // Stores the birth date of the animal
    private char sex;         // Stores the sex of the animal ('M' or 'F')
    private String Diet;      // Stores the diet type (e.g., herbivore, carnivore)
    private float weight;     // Stores the weight of the animal in kilograms
    public static String animal_id;    // Stores a unique identifier for the animal
    private static int currentId = 0;

    public Animal(String animal_name, String animal_id, float weight, String diet, char sex, Date birth_Date) {
        this.animal_name = animal_name;
        this.animal_id = animal_id;
        this.weight = weight;
        Diet = diet;
        this.sex = sex;
        this.birth_Date = birth_Date;
    }

    private String animal_name;  // Stores the name of the animal

    // Getter method for animal_name
    public String getAnimal_name() {
        return animal_name;
    }

    // Setter method for animal_name
    public void setAnimal_name(String animal_name) {
        this.animal_name = animal_name;
    }

    // Getter method for Diet
    public String getDiet() {
        return Diet;
    }

    // Setter method for Diet
    public void setDiet(String diet) {
        Diet = diet;
    }

    // Getter method for birth_Date
    public Date getBirth_Date() {
        return birth_Date;
    }

    // Setter method for birth_Date
    public void setBirth_Date(Date birth_Date) {
        this.birth_Date = birth_Date;
    }

    // Getter method for sex
    public char getSex() {
        return sex;
    }

    // Setter method for sex
    public void setSex(char sex) {
        this.sex = sex;
    }

    // Getter method for weight
    public float getWeight() {
        return weight;
    }

    // Setter method for weight
    public void setWeight(float weight) {
        this.weight = weight;
    }

    // Getter method for animal_id
    public String  getAnimal_id() {
        return animal_id;
    }

    // Methods
    // Prints "Eating" to the console
    void eat() {
        System.out.println("Eating");
    }

    // Prints "Drinking" to the console
    void drink() {
        System.out.println("Drinking");
    }

    // Prints "Fleeing" to the console
    void move() {
        System.out.println("Fleeing");
    }

    // Prints "Reproducing" to the console
    void reproduce() {
        System.out.println("Reproducing");
    }

    private static String generate_id(){
        currentId++;
        return String.valueOf(currentId);
    }

    public static Animal createAnimal(Scanner scanner) {
        System.out.println("Enter animal name: ");
        String name = scanner.nextLine(); // Captura o nome

        System.out.println("Enter animal weight (kg): ");
        float weight = scanner.nextFloat();
        scanner.nextLine();  // Consumir a nova linha

        System.out.println("Enter animal diet (e.g., Herbivore, Carnivore): ");
        String diet = scanner.nextLine(); // Captura a dieta

        System.out.println("Enter animal sex (M/F): ");
        char sex = scanner.nextLine().charAt(0); // Captura o sexo

        System.out.println("Enter birth date:");
        System.out.print("Day: ");
        int day = scanner.nextInt();
        System.out.print("Month: ");
        int month = scanner.nextInt() - 1;  // Janeiro é 0 em Calendar
        System.out.print("Year: ");
        int year = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha

        // Criando a data de nascimento
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        Date birthDate = calendar.getTime();

        // Criação e retorno do objeto Animal

        String id = generate_id();
        return new Animal(name, id, weight, diet, sex, birthDate);
    }

    // Displays the animal's information on the console
    void info() {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(getAnimal_name());  // Prints the animal's name
        System.out.println(getSex());          // Prints the animal's sex
        System.out.println(getWeight());       // Prints the animal's weight
        System.out.println(getBirth_Date());   // Prints the animal's birth date
        System.out.println(animal_id);    // Prints the animal's ID
        System.out.println(getDiet());         // Prints the animal's diet
    }
}
