package package1;

public class AquaticAnimals extends Animal {
    // Atributos específicos da classe AquaticAnimal
    private String waterType;            // Tipo de água: "Doce" ou "Salgada"
    private boolean canBreatheUnderwater; // Indica se o animal pode respirar debaixo d'água

    // Construtor da classe filha
    public AquaticAnimals(
            String animal_name,
            int animal_id,
            float weight,
            String diet,
            char sex,
            java.util.Date birth_Date,
            String waterType,
            boolean canBreatheUnderwater
    ) {
        // Chama o construtor da classe pai
        super(animal_name, animal_id, weight, diet, sex, birth_Date);
        this.waterType = waterType;
        this.canBreatheUnderwater = canBreatheUnderwater;
    }

    // Getters e Setters para os novos atributos
    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    public boolean isCanBreatheUnderwater() {
        return canBreatheUnderwater;
    }

    public void setCanBreatheUnderwater(boolean canBreatheUnderwater) {
        this.canBreatheUnderwater = canBreatheUnderwater;
    }

    // Métodos específicos da classe AquaticAnimal
    public void swim() {
        System.out.println("The aquatic animal is swimming.");
    }

    public void dive() {
        System.out.println("The aquatic animal is diving deep.");
    }

    // Sobrescrita (Override) do método info da classe Animal
    @Override
    public void info() {
        super.info(); // Chama o método info da classe pai
        System.out.println("Water Type: " + getWaterType());
        System.out.println("Can Breathe Underwater: " + (isCanBreatheUnderwater() ? "Yes" : "No"));
    }
}
