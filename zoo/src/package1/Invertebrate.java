package package1;

public class Invertebrate extends Animal {
    // Atributos específicos da classe Invertebrate
    private String habitat;      // Habitat do invertebrado (ex.: marinho, terrestre)
    private boolean canRegenerate; // Indica se o invertebrado pode regenerar partes do corpo

    // Construtor da classe filha
    public Invertebrate(
            String animal_name,
            int animal_id,
            float weight,
            String diet,
            char sex,
            java.util.Date birth_Date,
            String habitat,
            boolean canRegenerate
    ) {
        // Chama o construtor da classe pai
        super(animal_name, animal_id, weight, diet, sex, birth_Date);
        this.habitat = habitat;
        this.canRegenerate = canRegenerate;
    }

    // Getters e Setters para os novos atributos
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public boolean getCanRegenerate() {
        return canRegenerate;
    }

    public void setCanRegenerate(boolean canRegenerate) {
        this.canRegenerate = canRegenerate;
    }

    // Métodos específicos da classe Invertebrate
    public void camouflage() {
        System.out.println("The invertebrate is camouflaging.");
    }

    public void releaseToxin() {
        System.out.println("The invertebrate is releasing toxins as a defense mechanism.");
    }

    // Sobrescrita (Override) do método info da classe Animal
    @Override
    public void info() {
        super.info(); // Chama o método info da classe pai para exibir os atributos herdados
        System.out.println("Habitat: " + getHabitat());
        System.out.println("Can Regenerate: " + (getCanRegenerate() ? "Yes" : "No"));
    }
}
