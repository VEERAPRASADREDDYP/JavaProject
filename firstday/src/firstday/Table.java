package firstday;
import java.util.Scanner;
public class Table {
    private static Scanner scan;
	public void print(int n){
	
		for(int i=1;i<=n;i++){
			for(int j=0;j<4;j++){
				System.out.print((int)(i*Math.pow(10, j)) + "  ");
		}
			System.out.println();
		}
		
    	
    }
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter Value of N");
		int n=scan.nextInt();
	    Table obj=new Table();
	    obj.print(n);
		

	}

}
