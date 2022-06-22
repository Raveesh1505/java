/*1. Write a program that takes 5 integer command line arguments. Create a user defined Exception named 
CheckArgumentException to check the number of arguments passed through command line. If the number of arguments is 
less than five, throw the CheckArgumentException, else print the addition of all five numbers.

Definition of Done:

DOD 1:Create a user-defined exception by the name CheckArgumentException
DOD 2:Ask the user to enter the number of arguments
DOD 3:Use for loop to enter the arguments
DOD 4: Calculate the sum of the values entered
Name: Shivam
Roll No: 21CSU090
*/


class CheckArgumentException extends Exception {
       CheckArgumentException(String s){
              super(s);
       }
}

public class Prac8Q1
{

    public static void main(String[] args) throws Exception
    {
        int arr[] = new int[5];
        int sum = 0;
        try{
              for (int i = 0; i < args.length ;i++) {
                     arr[i] = Integer.parseInt(args[i]);
              }
              if (args.length < 5) {
                     throw new CheckArgumentException("Less than 5 arguments");
              }
              else{
                     for (int j = 0;j < args.length;j++) {
                            sum = sum + Integer.parseInt(args[j]);
                     }
              }
              System.out.println("Sum : " + sum);
        }
        catch (CheckArgumentException e){
              System.out.println(e);
        }
    }
}