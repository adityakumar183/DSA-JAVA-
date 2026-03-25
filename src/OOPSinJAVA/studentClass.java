package OOPSinJAVA;

public class studentClass {
    // crating a new data type
//    public static class Student{
//        String name;
//        int roll_no;
//        double percent;
//    }

    public static void main(String[] args) {

        class Car{     // Main function ke ander v hum class bna sakte hai lakin hum usko main function ke bahar use nahi kar sakte hai
            String name;
            String type;
            int price;
        }

        Student s1 = new Student();   // declaration
        s1.name = "Aditya Kumar";
        s1.roll_no = 12;
        s1.percent = 87.5;

        Student s2 = new Student();
        s2.name = "Ajay";
        s2.roll_no = 20;
        s2.percent = 87.5;

        Car x = new Car();
        x.name = "BMW";
        x.type = "SUV";
        x.price = 1000000;

        System.out.println(x.name);
    }
}
