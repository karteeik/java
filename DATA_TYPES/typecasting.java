class TypeCastingEx{
	public static void main(String[] args){
		//Type casting in Java refers to converting a variable of one data type to another
		//there are two primary type of type casting 1)widening(implicit) - always safe 2)narrowing(explicit) - data loss and unexpected result
		

		//widening(implicit) 	--> byte --> short --> int --> long --> float  --> double        
		//syntax --> LargerTypeVar=SmallerTypeVar;
		int a=123; 	//123.0
		float result=a; 
		System.out.println(a);
		System.out.println(result);

		//char-->int
		char s='A';
		int r=s;
		System.out.println(s);
		System.out.println(r);

		//narrowing(explicit)  --> double --> float --> long --> int --> short --> byte
		//syntax --> SmallerTypeVar=(SmallerType)LargerTypeVar;
		double f=324.43;
		int res1=(int)f;
		System.out.println(f);
		System.out.println(res1);
	
		//int --> char ((if within the range of char)
		int s1=66;
		char r1=(char)s1;
		System.out.println(s1);
		System.out.println(r1);
	}
}