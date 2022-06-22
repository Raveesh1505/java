/*
3.	Write a program to perform simple read and write operation into file.
Name: Shivam
Roll No: 21CSU090
*/

import java.io.*;
import java.util.*;

class Prac9Q3{
	public static void main(String[] args) {
		File f = null;
		try{
			f = new File("Prac9Q3.txt");
			FileWriter writer = new FileWriter(f, true);
			BufferedWriter buff = new BufferedWriter(writer);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter String :");
			buff.write(sc.nextLine());
			buff.newLine();
			buff.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}

		try{
			f = new File("Prac9Q3.txt");
			FileReader reader = new FileReader(f);
			BufferedReader btwo = new BufferedReader(reader);

			String string;

			while((string = btwo.readLine()) != null ){
				System.out.println(string);
			}

		}
		catch(Exception e){	
			e.printStackTrace();
		}
	}
}