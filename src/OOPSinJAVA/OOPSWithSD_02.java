package OOPSinJAVA;
// Compile-time Polymorphism (Method Overloading)
class Aditya {
   String name;
   int age;

   public void printInfo(String name){
       System.out.println(name);
   }

   public void printInfo(int age){
       System.out.println(age);
   }

   public void printInfo(String name,int age){
       System.out.println(name);
       System.out.println(age);
   }
}

/*
         class Calculator {
              int add(int a, int b) {
                  return a + b;
              }

              double add(double a, double b) {
                   return a + b;
               }
         }
 */

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
        Aditya ad = new Aditya();
        ad.name = "Aman";
        ad.age = 23;

        ad.printInfo(ad.name);
        ad.printInfo(ad.age);
        ad.printInfo(ad.name,ad.age);

        // Method Overriding
        Animal a1 = new Dog();  // reference of Animal, object of Dog
        Animal a2 = new Cat();  // reference of Animal, object of Cat

        a1.sound();  // Dog barks
        a2.sound();  // Cat meows
    }
}
