package OOPSinJAVA;

public class constructor {

    // class creation:-
    public static class aditya{
        String name;
        int roll_no;
        double percent;
        int age;

        // constructor:_
        public aditya(String name,int roll_no,double percent, int age){
            this.name=name;          // this keyword yaha v difference pta karne ke liye use huaa hai
            this.roll_no=roll_no;
            this.percent=percent;
            this.age=age;
        }
    }

    public static void main(String[] args) {

        // using constructor of class aditya:-
        aditya s1 = new aditya("Aditya Kumar", 12, 92.5, 21);
        System.out.println("Class : aditya");
        System.out.println("Name: " + s1.name);
        System.out.println("Roll no: " + s1.roll_no);
        System.out.println("Percent: " + s1.percent);
        System.out.println("Age: " + s1.age);

        System.out.println();

        // using constructor of class Student:-
        System.out.println("Class : Student");
        Student s2 = new Student("aditya", 12, 92);
        System.out.println("Name: " + s2.name);
        System.out.println("Roll no: " + s2.roll_no);
        System.out.println("Percent: " + s2.percent);
        System.out.println(s2.numberofstudents);

        Student s3 = new Student("aditya kr.", 120, 92.78);
        System.out.println(s3.numberofstudents);

        Student s4 = new Student("ram",13,34.9);
        System.out.println(s4.numberofstudents);

        Student s5 = new Student("shyam",19,78.4);
        System.out.println(s5.numberofstudents);
    }
}
