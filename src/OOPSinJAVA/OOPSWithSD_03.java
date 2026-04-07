package OOPSinJAVA;
// Encapsulation Example in Java
class Studentss {
    // Private data members (hidden from outside)
    private String name;
    private int age;

    // Public getter method for name
    public String getName() {
        return name;
    }

    // Public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for age
    public int getAge() {
        return age;
    }

    // Public setter method for age with validation
    public void setAge(int age) {
        if (age > 0) {   // simple validation
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}

public class OOPSWithSD_03 {
    public static void main(String[] args) {
        // Create object of Student
        Studentss s1 = new Studentss();

        // Set values using setter methods
        s1.setName("Aditya");
        s1.setAge(22);

        // Access values using getter methods
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student Age: " + s1.getAge());
    }
}
