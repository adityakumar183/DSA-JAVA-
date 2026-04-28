package OOPSinJAVA;
// Inheritance:-

class Shape {
   public void area() {
       System.out.println("display area");
   }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(0.5*l*h);
    }
}

class Equilateraltriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(0.5*l*h);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println(3.14*r*r);
    }
}

public class OOPSWithSD_04 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();

        // Parent class method call
        t1.area(); // Output: display area

        // Child class method call
        t1.area(10, 5); // Output: 25

        Circle c1 = new Circle();
        c1.area(7); // Output: 153.86 (approx)

        Equilateraltriangle e1 = new Equilateraltriangle();
        e1.area(6, 4); // Output: 12
    }
}
