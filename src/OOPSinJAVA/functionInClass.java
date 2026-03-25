package OOPSinJAVA;

public class functionInClass {

    public static void change(Student s){
        s.name = "Kabir";
        return;
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Aditya Kumar";
        s1.roll_no = 12;
        s1.percent = 8.24;
        System.out.println(s1.name);

        change(s1);
        System.out.println(s1.name);
        s1.setAge(22);
        System.out.println(s1.getAge());
    }
}
