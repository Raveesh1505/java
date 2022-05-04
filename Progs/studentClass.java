class Student{
    String name;
    int roll_no;
}

public class studentClass {
    public static void main(String[] args) {
        Student std1 = new Student();

        std1.name = "John";
        std1.roll_no = 2;

        System.out.println("Name : " + std1.name + "\nRoll Number : " + std1.roll_no);
    }
}