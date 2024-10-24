package package1;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the Zoo!");

        Animal galinha = new Animal();
        galinha.info();
        galinha.reproduce();

        Vertebrate  vertebrate = new Vertebrate();
        vertebrate.info();
        vertebrate.setHabitat("Jungle");
        vertebrate.setReproduction("oviparous");
        System.out.println(vertebrate.getHabitat());

        vertebrate.reproduce();
    }
}
