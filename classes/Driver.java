package classes;

// "Driver" is a very common name which has main methods.
// Driver == Client
public class Driver {
    public static void main(String[] args) {
        Pokemon pika = new Pokemon("Pikachu", "Electric", 100, 70);
        // make instance without constructor
//        pika.name = "Pikachu";
//        pika.type = "Electric";
//        pika.healthPoint = 100;
//        pika.attackPoint = 70;

        // Pokemon charizard = instance
        // make instance by constructor
        Pokemon charizard = new Pokemon("charizard", "Fire/Frie", 120, 70);

        // accessing fields
        System.out.println(pika.name);
        System.out.println(charizard.type);

        // call methods on an instance(object)
        pika.attack(charizard);
        System.out.println("Charizard (HP): " + charizard.healthPoint);
        pika.evolve();
        pika.attack(charizard);
        System.out.println("Charizard (HP): " + charizard.healthPoint);
    }
}
