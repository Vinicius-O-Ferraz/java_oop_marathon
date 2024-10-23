package package1;

import java.util.Date;

public class Animal {
    // Attributes
    Date birth_Date;
    char sex;
    String Diet;
    float weight;
    int animal_id;
    String animal_name;

    public String getAnimal_name() {
        return animal_name;
    }

    public void setAnimal_name(String animal_name) {
        this.animal_name = animal_name;
    }


    public String getDiet() {
        return Diet;
    }

    public void setDiet(String diet) {
        Diet = diet;
    }



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
        System.out.println(getAnimal_name());
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(getSex());
        System.out.println(getWeight());
        System.out.println(getBirth_Date());
        System.out.println(getAnimal_id());
        System.out.println(getDiet());
    }
}
