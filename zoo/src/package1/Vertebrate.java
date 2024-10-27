package package1;

import java.util.Date;

public class Vertebrate extends Animal {
    // Attributes
    private boolean hasJaw;          // Indicates if the vertebrate has a jaw
    private boolean hasSpinalCord;   // Indicates if the vertebrate has a spinal cord
    private String breathingType;    // Describes how the vertebrate breathes (e.g., lungs, gills)
    private String habitat;          // Describes the habitat (e.g., aquatic, terrestrial)
    private String reproduction;     // Describes the type of reproduction (e.g., oviparous, viviparous)
    private int numberOfMembers;     // Stores the number of body members (e.g., limbs)

    public Vertebrate(String animal_name, String animal_id, float weight, String diet, char sex, Date birth_Date, boolean hasSpinalCord, boolean hasJaw, String breathingType, String habitat, String reproduction, int numberOfMembers) {
        super(animal_name, animal_id, weight, diet, sex, birth_Date);
        this.hasSpinalCord = hasSpinalCord;
        this.hasJaw = hasJaw;
        this.breathingType = breathingType;
        this.habitat = habitat;
        this.reproduction = reproduction;
        this.numberOfMembers = numberOfMembers;
    }

    // Getter method for hasJaw
    public boolean isHasJaw() {
        return hasJaw;
    }

    // Setter method for hasJaw
    public void setHasJaw(boolean hasJaw) {
        this.hasJaw = hasJaw;
    }

    // Getter method for hasSpinalCord
    public boolean isHasSpinalCord() {
        return hasSpinalCord;
    }

    // Setter method for hasSpinalCord
    public void setHasSpinalCord(boolean hasSpinalCord) {
        this.hasSpinalCord = hasSpinalCord;
    }

    // Getter method for breathingType
    public String getBreathingType() {
        return breathingType;
    }

    // Setter method for breathingType
    public void setBreathingType(String breathingType) {
        this.breathingType = breathingType;
    }

    // Getter method for habitat
    public String getHabitat() {
        return habitat;
    }

    // Setter method for habitat
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    // Getter method for reproduction
    public String getReproduction() {
        return reproduction;
    }

    // Setter method for reproduction
    public void setReproduction(String reproduction) {
        this.reproduction = reproduction;
    }

    // Getter method for numberOfMembers
    public int getNumberOfMembers() {
        return numberOfMembers;
    }

    // Setter method for numberOfMembers
    public void setNumberOfMembers(int numberOfMembers) {
        this.numberOfMembers = numberOfMembers;
    }

    // Processes stimuli using the central nervous system
    public void processStimuli() {
        System.out.println("Processing stimuli with the central nervous system");
    }

    // Overrides the reproduce method from Animal class
    @Override
    public void reproduce() {
        System.out.println("Reproducing in an " + getReproduction() + " way");
    }

    // Overrides the move method from Animal class to describe movement
    @Override
    void move() {
        System.out.println("Moving with my " + this.numberOfMembers + " members");
    }
}
