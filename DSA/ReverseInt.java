import java.util.*;
public class ReverseInt{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n,rem,rev=0;
		System.out.print("Enter an integer number : ");
		n=sc.nextInt();

			while(n!=0){
				rem=n%10;
				rev=rev*10+rem;
				n=n/10;
			}
		
		System.out.println(rev);

		sc.close();
	}
}