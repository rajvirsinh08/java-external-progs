package education;

import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		String name;
		int n;
		
		System.out.println("Enter Student name:");
		name=sc.next();
		
		System.out.println("Enter number of subjects:");
		n=sc.nextInt();
		
		String sub[]=new String[n];
		int marks[]=new int[n];
		
		
		for(int i=0;i<n;i++){
			System.out.println("Enter subject name:");
			sub[i]=sc.next();
			
			System.out.println("Enter marks:");
			marks[i]=sc.nextInt();
			
		}
		
		Student s=new Student(name,sub,marks);
		
		System.out.println(s);
		
		sc.close();
	}
}