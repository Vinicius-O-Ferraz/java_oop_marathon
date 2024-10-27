package package1;

import java.util.Date;

public class Mammal extends Vertebrate {
    // Attributes specific to Mammals
    private String furColor;          // Describes the color of the fur
    private boolean isWarmBlooded;    // Indicates if the mammal is warm-blooded

    public Mammal(String animal_name, String animal_id, float weight, String diet, char sex, Date birth_Date, boolean hasSpinalCord, boolean hasJaw, String breathingType, String habitat, String reproduction, int numberOfMembers, String furColor, boolean isWarmBlooded) {
        super(animal_name, animal_id, weight, diet, sex, birth_Date, hasSpinalCord, hasJaw, breathingType, habitat, reproduction, numberOfMembers);
        this.furColor = furColor;
        this.isWarmBlooded = isWarmBlooded;
    }

    // Getter method for furColor
    public String getFurColor() {
        return furColor;
    }

    // Setter method for furColor
    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    // Getter method for isWarmBlooded
    public boolean isWarmBlooded() {
        return isWarmBlooded;
    }

    // Setter method for isWarmBlooded
    public void setWarmBlooded(boolean isWarmBlooded) {
        this.isWarmBlooded = isWarmBlooded;
    }

    // Method specific to Mammals
    public void nurseYoung() {
        System.out.println("Nursing young");
    }

    // Overrides the processStimuli method from Vertebrate class
    @Override
    public void processStimuli() {
        System.out.println("Processing stimuli with advanced mammalian senses");
    }

    // Overrides the move method from Vertebrate class to provide specific movement behavior
    @Override
    void move() {
        System.out.println("Moving swiftly on " + this.getNumberOfMembers() + " limbs");
    }
}
