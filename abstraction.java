// Interface (Abstraction)
interface Animal {
    void makeSound(); // abstract method
    void eat();       // another abstract method
}

// Dog class implements Animal interface
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }

    public void eat() {
        System.out.println("Dog eats bones.");
    }
}

// Cat class implements Animal interface
class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat meows: Meow Meow!");
    }

    public void eat() {
        System.out.println("Cat eats fish.");
    }
}

// Main class to test abstraction
public class abstraction {
    public static void main(String[] args) {
        Animal dog = new Dog(); // upcasting
        Animal cat = new Cat();

        dog.makeSound();
        dog.eat();

        cat.makeSound();
        cat.eat();
    }
}
