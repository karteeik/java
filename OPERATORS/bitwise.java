public class Bitwise{
	public static void main(String[] args){
		// operands --> byte short int long 
		//Binary conversion only (.toBinaryString())

		// and operator &
		int a=5&4;
		System.out.println(a);		
		
		// or operator |	
		int b=5|4;
		System.out.println(b);	
	
		// xor ^

		int c=5^4;
		System.out.println(c);		

		// not ~
		int d=4;
		int e=~4;
		System.out.println(d);
		System.out.println(e);	
	
		// left shift <<
		int f=6<<2;
		System.out.println(f);
	
		// right shift >>
		int g=5>>3;
		System.out.println(g);
		
		// unsigned right shift >>>
		int h=20>>>2;
		System.out.println(h);
	}
}