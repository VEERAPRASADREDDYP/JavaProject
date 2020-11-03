package firstday;

import java.util.Scanner;

public class Fahreinheit {
	public static Scanner scan;
	public float calculate(){
		scan=new Scanner(System.in);
		float n=scan.nextFloat();
		float val=(float)(5*(n-32)/9);
	
			return val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Fahreinheit value");
		Fahreinheit obj=new Fahreinheit();
		float c =obj.calculate();
		
		System.out.println("In Celsius:" +c);

	}

}
