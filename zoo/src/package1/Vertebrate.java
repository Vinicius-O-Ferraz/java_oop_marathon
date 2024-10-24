package package1;

public class Vertebrate extends Animal {
    // Attributes
    private boolean hasJaw;          // Indicates if the vertebrate has a jaw
    private boolean hasSpinalCord;   // Indicates if the vertebrate has a spinal cord
    private String breathingType;    // Describes how the vertebrate breathes (e.g., lungs, gills)
    private String habitat;          // Describes the habitat (e.g., aquatic, terrestrial)
    private String reproduction;     // Describes the type of reproduction (e.g., oviparous, viviparous)
    private int numberOfMembers;     // Stores the number of body members (e.g., limbs)

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
