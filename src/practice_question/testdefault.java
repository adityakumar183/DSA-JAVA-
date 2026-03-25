package practice_question;

import OOPSinJAVA.Student;

public class testdefault {
    public static void main(String[] args) {
        Student s1 = new Student();
        // s1.name = "aditya";
        // java: name is not public in OOPSinJAVA.Student; cannot be accessed from outside package

        s1.none = "hello";
        System.out.println(s1.none);
    }
}
