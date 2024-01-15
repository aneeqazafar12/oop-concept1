class Animal {
    String species;

    public Animal(String species) {
        this.species = species;
    }

    public void makeSound() {
        // Method to be overridden in derived classes
    }
}

class Dog extends Animal {
    public Dog(String species) {
        super(species);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    public Cat(String species) {
        super(species);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating instances of the derived classes
        Dog dogInstance = new Dog("Canine");
        Cat catInstance = new Cat("Feline");

        // Accessing attributes and invoking methods
        System.out.println("A " + dogInstance.species + " says: ");
        dogInstance.makeSound();

        System.out.println("A " + catInstance.species + " says: ");
        catInstance.makeSound();
    }
}