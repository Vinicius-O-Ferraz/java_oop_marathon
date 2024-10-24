package package1;

public class Poultry extends Vertebrate {
    // Attributes specific to Poultry
    private boolean canFly;            // Indicates if the poultry can fly
    private String featherColor;       // Describes the color of the feathers

    // Getter method for canFly
    public boolean isCanFly() {
        return canFly;
    }

    // Setter method for canFly
    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    // Getter method for featherColor
    public String getFeatherColor() {
        return featherColor;
    }

    // Setter method for featherColor
    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    // Method specific to Poultry
    public void layEgg() {
        System.out.println("Laying an egg");
    }

    // Overrides the reproduce method from Vertebrate class
    @Override
    public void reproduce() {
        System.out.println("Laying eggs in an " + getReproduction() + " way");
    }

    // Overrides the move method from Vertebrate class to describe poultry movement
    @Override
    void move() {
        System.out.println("Moving with a flap and a waddle");
    }
}
