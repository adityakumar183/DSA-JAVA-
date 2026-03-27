package OOPSinJAVA;

// Class in different file:-
public class Student {
    String name;
    int roll_no;
    double percent;
    private int age;
    public String none;
    static int numberofstudents;
    final String collegeName = "IES college";   // cannot CHANGE a value to final variable collegeName

    // default constructor
    public Student() {

    }

    // parametrized constructor
    public Student(String naam, int roll, double perc) {
        name = naam;
        roll_no = roll;
        percent = perc;
        numberofstudents++;
    }

    // getter function
    public int getAge(){
        return age;
    }

    // setter function
    public void setAge(int age){
        this.age = age;
    }
}



















// ager dusre package me iss class ko use karna hai to pahle isko import karna hoga.

// for some test use practice question package........(test default)