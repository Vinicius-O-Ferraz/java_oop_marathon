package package1;

public class LandAnimals extends Invertebrate {
    // Atributos específicos da classe LandAnimal
    private String terrainType;   // Tipo de terreno: "Florestal", "Desértico", etc.
    private boolean isNocturnal;  // Indica se o animal é noturno

    // Construtor da classe filha
    public LandAnimals(
            String animal_name,
            String animal_id,
            float weight,
            String diet,
            char sex,
            java.util.Date birth_Date,
            String habitat,
            boolean canRegenerate,
            String terrainType,
            boolean isNocturnal
    ) {
        // Chama o construtor da classe Invertebrate
        super(animal_name, animal_id, weight, diet, sex, birth_Date, habitat, canRegenerate);
        this.terrainType = terrainType;
        this.isNocturnal = isNocturnal;
    }

    // Getters e Setters para os novos atributos
    public String getTerrainType() {
        return terrainType;
    }

    public void setTerrainType(String terrainType) {
        this.terrainType = terrainType;
    }

    public boolean isNocturnal() {
        return isNocturnal;
    }

    public void setNocturnal(boolean nocturnal) {
        isNocturnal = nocturnal;
    }

    // Métodos específicos da classe LandAnimal
    public void run() {
        System.out.println("The land animal is running swiftly.");
    }

    public void climb() {
        System.out.println("The land animal is climbing a tree.");
    }

    // Sobrescrita (Override) do método info da classe Invertebrate
    @Override
    public void info() {
        super.info(); // Chama o método info da classe Invertebrate
        System.out.println("Terrain Type: " + getTerrainType());
        System.out.println("Is Nocturnal: " + (isNocturnal() ? "Yes" : "No"));
    }
}
