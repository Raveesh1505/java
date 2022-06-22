/*
2.  Write a program to change the file permissions.
Name: Shivam
Roll No: 21CSU090
*/

import java.io.*;
 
public class Prac9Q2 {
    public static void main(String[] args)
    {
        File file = new File("Prac9Q2.java");
        boolean exists = file.exists();
        if (exists == true) {
            file.setExecutable(true);
            file.setReadable(true);
            file.setWritable(true);
            System.out.println("Executable: "
                               + file.canExecute());
            System.out.println("Readable: "
                               + file.canRead());
            System.out.println("Writable: "
                               + file.canWrite());
        }
        else {
            System.out.println("File not found.");
        }
    }
}