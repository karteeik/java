// Indivisual digit sum like input 123 then output is 6
import java.util.*;
public class DigitSum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		int n=sc.nextInt();
		int rem,sum=0;

		while(n!=0){
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("you'r input number indivisual sum is : "+sum);
		sc.close();
	}
}

