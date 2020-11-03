package firstday;

import java.util.Scanner;

public class Largest {
	void check(int[] p){
		int large = p[0];
		for(int i=0;i<p.length;i++){
			if(large<p[i])
				large=p[i];
			
		}
		System.out.println(large);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] p=new int[20];
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for (int i=0;i<n;i++){
		 p[i]=scan.nextInt();
		
		}
		
		Largest obj=new Largest();
		obj.check(p);
	}

}
