package firstday;

import java.util.Scanner;

public class Student {

		int num;
		String name;
	
	public void accept(Student std){
		Scanner scan=new Scanner(System.in);
		std.num=scan.nextInt();
		std.name=scan.next();
		//System.out.println(num);
		//System.out.println(name);
	
	}
	public void display(Student std){
		System.out.println(std.num);
		System.out.println(std.name);
		
	}

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
	
		Student[] std=new Student[20];
		for(int i=0;i<std.length;i++){
			std[i]=new Student();
		
			std[i].accept(std[i]);
			std[i].display(std[i]);
			
			
		}
	}

}
