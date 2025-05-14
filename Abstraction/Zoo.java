// Interface for flying behavior
interface Flyable {
    void fly();
}

// Interface for swimming behavior
interface Swimmable {
    void swim();
}

// Abstract class for all animals
abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void sleep() {
        System.out.println(name + " is sleeping...");
    }

    abstract void makeSound(); // all animals make sounds, but differently
}

// A Bird is an Animal that can Fly
class Bird extends Animal implements Flyable {
    Bird(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying in the sky!");
    }

    @Override
    void makeSound() {
        System.out.println(name + " chirps!");
    }
}

// A Fish is an Animal that can Swim
class Fish extends Animal implements Swimmable {
    Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming in water!");
    }

    @Override
    void makeSound() {
        System.out.println(name + " makes blub-blub!");
    }
}

// A Dog is a mammal, doesn't fly or swim
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " barks!");
    }
}

// Demo
public class Zoo {
    public static void main(String[] args) {
        Bird parrot = new Bird("Parrot");
        Fish goldfish = new Fish("Goldfish");
        Dog dog = new Dog("Buddy");

        parrot.sleep();
        parrot.fly();
        parrot.makeSound();

        goldfish.swim();
        goldfish.makeSound();

        dog.sleep();
        dog.makeSound();
    }
}
