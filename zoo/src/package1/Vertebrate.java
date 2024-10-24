package package1;

public class Vertebrate extends Animal{
    private boolean hasJaw;
    private boolean hasSpinalCord;
    private String breathingType;
    private String habitat;
    private String reproduction;
    private int numberOfMembers;

    public boolean isHasJaw() {
        return hasJaw;
    }

    public void setHasJaw(boolean hasJaw) {
        this.hasJaw = hasJaw;
    }

    public boolean isHasSpinalCord() {
        return hasSpinalCord;
    }

    public void setHasSpinalCord(boolean hasSpinalCord) {
        this.hasSpinalCord = hasSpinalCord;
    }

    public String getBreathingType() {
        return breathingType;
    }

    public void setBreathingType(String breathingType) {
        this.breathingType = breathingType;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getReproduction() {
        return reproduction;
    }

    public void setReproduction(String reproduction) {
        this.reproduction = reproduction;
    }

    public int getNumberOfMembers() {
        return numberOfMembers;
    }

    public void setNumberOfMembers(int numberOfMembers) {
        this.numberOfMembers = numberOfMembers;
    }
}
