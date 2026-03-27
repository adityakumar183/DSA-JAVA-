package OOPSinJAVA;

// Class in different file:-
public class Student {
    String name;
    int roll_no;
    double percent;
    private int age;
    public String none;

    // getter function
    public int getAge(){     // getter function
        return age;
    }

    // setter function
//    public void setAge(int Age){
//        age = Age;
//    }

    // setter function
    public void setAge(int age){       // setter function using "this" keyword
        this.age = age;
    }
}



// ager dusre package me iss class ko use karna hai to pahle isko import karna hoga.

// for some test use practice question package........(test default)