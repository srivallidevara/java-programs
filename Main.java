// Base class
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

// Derived class
class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // Base class method
        d.bark(); // Derived class method
    }
}
