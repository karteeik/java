import java.util.*;
public class PalindromeNumCheck{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n,rem,rev=0;
		System.out.print("Enter an integer number : ");
		n=sc.nextInt();
		int a=n;

		while(n>0){
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		
		if(a==rev){
			System.out.println(rev + " is palindrome number !!!");
		}		
		else{
			System.out.println(rev + " is not palindrome number !!!");
		}
		
		sc.close();
	}
}