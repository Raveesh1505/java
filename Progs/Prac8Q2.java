/*2. Create a class with a main() method that throws an object of class Exception inside a try block. Give the 
constructor for Exception a String argument. Catch the exception inside a catch clause and print the String argument. 
Add a finally clause and print a message to prove you were there.
Name: Shivam
Roll No: 21CSU090
*/


public class Prac8Q2 {
    public static void main(String[] args) {
        try {
            throw new Exception("Error occured");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Exception Handled");
        } finally {
            System.out.println("I Was Here");
        }
    }
}