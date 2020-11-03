package firstday;
import java.util.*;
public class Ternary {
	public static Scanner scan;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scan= new Scanner(System.in);
		
		System.out.println("Enter Three Numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int d=(a>b?((a>c)?a:c):((b>c)?b:c));
		System.out.println(d);
	}

}
