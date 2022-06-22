/*
1.	Write a program to check if the file exist is a file or directory
Name: Shivam
Roll No: 21CSU090
*/

import java.io.*;

public class Prac9Q1{
	public static void main(String[] args) {
		File f = new File("Prac9Q1.java");
		if (f.exists()) {
			System.out.println("exists");			
		}
		else{
			System.out.println("Doesn't exists");
		}
	}
}