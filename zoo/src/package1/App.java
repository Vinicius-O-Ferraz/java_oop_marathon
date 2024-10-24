package package1;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the jungle!");

        Animal galinha = new Animal();
        galinha.info();

        Vertebrate  vertebrate = new Vertebrate();
        vertebrate.info();
    }
}
