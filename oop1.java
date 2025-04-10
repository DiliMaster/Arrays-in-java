import java.util.*;

public class oop1 {
	
	public static void main (String[] args) {
		
		int x =10;
		int [] ar = new int [10];
		
		ar[0] = 10;
		ar[1] = 20;
		
		Student[] ar1 = new Student[10];
		
		ar1[0] = new Student(); 
		
		ar1[0].name = "Anjana";
		
		System.out.println(ar1[0]);
		
		
		
	}
	
}

class Student {
    // Class properties/fields
    String name;    // Stores student's name
    int age;        // Stores student's age
    String address; // Stores student's address
}
