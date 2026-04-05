package OOPSinJAVA;

class Pen{
    String color;
    String type;
    int price;

    public void write(){
        System.out.println("writing something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

class Students{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // default constructor:-
    Students(){
        System.out.println("default constructor");
    }

    // parametrized constructor:-
    Students(String name, int age){
        this.name=name;
        this.age=age;
    }

    // copy constructor:-
    Students(Students s3){
        this.name=s3.name;
        this.age=s3.age;
    }
}

public class OOPSWithSD {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "red";
        p1.type = "gel";
        p1.price = 100;
        p1.write();
        p1.printColor();

        Pen p2 = new Pen();
        p2.color = "blue";
        p2.type = "ball";
        p2.price = 200;
        p2.write();
        p2.printColor();

        Students s1 = new Students();
        s1.name = "Aditya";
        s1.age = 21;
        s1.printInfo();

        Students s2 = new Students("Aman",24);
        s2.printInfo();

        Students s3 = new Students(s2);
        s3.printInfo();
    }
}
