package classes;

// blueprint (template)  fields -> methods
public class Pokemon {
    // fields(attributes) - with simple variables
    String name;
    String type;
    int healthPoint;
    int attackPoint;

    // constructor : a special method to create an object(instance)
    // - default constructor : without any parameters
    // - default constructor is given by the compiler if you don't define any constructor.
    Pokemon(String name, String type, int healthPoint, int attackPoint) {
        this.name = name;
        this.type = type;
        this.healthPoint = healthPoint;
        this.attackPoint = attackPoint;
    }

    // methods(behaviors) - with functions
    // Pokemon enemy = pokemon type
    void attack(Pokemon enemy) {
        if (enemy.dodge()) {
            System.out.println(enemy.name + " dodged my super-power attack!");
        } else {
            // What is "this" ?
            // - "self-reference"
            System.out.println(this.name + " is attacking "+ enemy.name +" with " + this.attackPoint);
            enemy.healthPoint -= this.attackPoint;
        }

    }

    boolean dodge() {
        // Math.random(): returns a a random double value
        // ( 0.0 <= value < 1.0 )
        return Math.random() > 0.5;
    }

    void evolve() {
        // "this" is optional since it's clear
        // (no parameters, or no parameters which have same name )
        System.out.println(this.name + " is evolving...");
        this.healthPoint += 20;
        attackPoint += 20;

    }


}
