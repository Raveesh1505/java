import java.util.Scanner;

public class invertedTriangle {
    public static void main(String args[]){
        int age;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter age");
        age=obj.nextInt();
        System.out.println(age);
        obj.close();
        if(age>20){
            System.out.println("you are adult");
        }
        else if(age > 6 && age<=20){
            System.out.println("you are not a kid");
        }
        else if(age<=6){
            System.out.println("you are a kid");
        }    
    }
}