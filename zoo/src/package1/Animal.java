package package1;

import java.util.Date;

public class Animal {
    // Attributes
    Date birth_Date;
    char sex;
    float weight;
    int animal_id;

    public Date getBirth_Date() {
        return birth_Date;
    }

    public void setBirth_Date(Date birth_Date) {
        this.birth_Date = birth_Date;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAnimal_id() {
        return animal_id;
    }

    public void setAnimal_id(int animal_id) {
        this.animal_id = animal_id;
    }

    // Methods
    void eat() {
        System.out.println("Eating");
    }

    void drink() {
        System.out.println("Drinking");
    }

    void flee() {
        System.out.println("Fleeing");
    }

    void info(){
        System.out.println(birth_Date);
        System.out.println(sex);
        System.out.println(weight);
        System.out.println(animal_id);
    }
}
