package OOPSinJAVA;
// Abstraction:-

abstract class Animals {
    abstract void walk();
    Animals() {
        System.out.println("You are creating an Animal");
    }
    public void eat(){
        System.out.println("Animals eat");
    }
}

class Horse extends Animals {
    Horse() {
        System.out.println("You are creating a Horse");
    }
    public void walk(){
        System.out.println("walk on 4 legs");
    }
}

class Chicken extends Animals {
    public void walk(){
        System.out.println("walk on 2 legs");
    }
}

public class OOPSWithSD_06 {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
        Chicken chicken = new Chicken();
        chicken.walk();
    }
}



/*
 Abstract Class:-

· An abstract class must be declared with an abstract keyword.
. It can have abstract and non-abstract methods.
. It cannot be instantiated.
. It can have constructors and static methods also.
. It can have final methods which will force the subclass not to change the body of
the method.

 */