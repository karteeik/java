import java.util.*;
public class ArmstrongNum{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n,rem,sum=0;
		System.out.print("Enter an integer number : ");
		n=sc.nextInt();
		int a=n;

		while(n!=0){
			rem=n%10;
			sum+=(rem*rem*rem);
			n/=10;
		}
		
		if(a==sum){
			System.out.println(a + " is armstrong number !!!");
		}		
		else{
			System.out.println(a + " is not armstrong number !!!");
		}

		sc.close();
	}
}