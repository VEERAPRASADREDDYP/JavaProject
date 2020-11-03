
package firstday;
import java.util.*;
public class Armstrong {
	private static Scanner scan;

	public static boolean check(){
	       scan = new Scanner(System.in);
	       System.out.println("Enter number");
	       int n=scan.nextInt();
	       int j=n;
	       int k=n;
	       int i=0;
	       int sum=0;
	       int p = 0;
	       while(j!=0){
	          j=j/10;
	          i=i+1;
	        }
	       while(k!=0){
	        p=(int)k%10;
	        
	        sum=(int)(sum+Math.pow(p,i));
	        k=k/10;
	        }
	        if(sum==n)
	          return true;
	        else
	        	return false;
	}

	   public static void main(String args[]){
	         boolean a=Armstrong.check();
	         System.out.println(a);
	}


}
