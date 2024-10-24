package package1;

import java.util.Date;

public class Animal {
    // Attributes
    private Date birth_Date;  // Stores the birth date of the animal
    private char sex;         // Stores the sex of the animal ('M' or 'F')
    private String Diet;      // Stores the diet type (e.g., herbivore, carnivore)
    private float weight;     // Stores the weight of the animal in kilograms
    private int animal_id;    // Stores a unique identifier for the animal
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
    public int getAnimal_id() {
        return animal_id;
    }

    // Setter method for animal_id
    public void setAnimal_id(int animal_id) {
        this.animal_id = animal_id;
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

    // Displays the animal's information on the console
    void info() {
        System.out.println(getAnimal_name());  // Prints the animal's name
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(getSex());          // Prints the animal's sex
        System.out.println(getWeight());       // Prints the animal's weight
        System.out.println(getBirth_Date());   // Prints the animal's birth date
        System.out.println(getAnimal_id());    // Prints the animal's ID
        System.out.println(getDiet());         // Prints the animal's diet
    }
}
