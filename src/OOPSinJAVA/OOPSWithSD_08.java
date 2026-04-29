package OOPSinJAVA;
// Static keyword:-

class Studentsss{
    String name;
    static String college;

    public static void changeCollege(){
        college = "newCollege";
    }
}

public class OOPSWithSD_08 {
    public static void main(String[] args) {
        Studentsss.college = "IES";
        Studentsss student1 = new Studentsss();
        student1.name = "Aditya";
        System.out.println(student1.college);
    }
}
