package OOPSinJAVA;
// Compile-time Polymorphism (Method Overloading)
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

// Runtime Polymorphism (Method Overriding)
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class OOPSWithSD_02 {
    public static void main(String[] args) {
        // Method Overloading
        Calculator calc = new Calculator();
        System.out.println("Sum of ints: " + calc.add(5, 10));
        System.out.println("Sum of doubles: " + calc.add(3.5, 2.5));

        // Method Overriding
        Animal a1 = new Dog();  // reference of Animal, object of Dog
        Animal a2 = new Cat();  // reference of Animal, object of Cat

        a1.sound();  // Dog barks
        a2.sound();  // Cat meows
    }
}
