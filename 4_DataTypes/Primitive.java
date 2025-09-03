import java.util.*;
public class Primitive{
	public static void main(String[] args){
		// 1- primitive datatypes (byte,short,integer,long,float,double,character,boolean) -->built in data types
		// 2 - non-primitive datatypes (string,array,class,interface) -->created by the programmer

		// whole numbers
			// byte
			// short
			// int
			// long

			byte age=10;
			short age1=20;
			int age2=30;
			long age3=40l;		//add (L or l) to define long data type	
		
			System.out.println(age+"/"+age1+"/"+age2+"/"+age3);

			// MIN_VALUE and MAX_VALUE used to check minimum and maximum range in data type
			System.out.println("------------------ 1 - primitive data type-----------------------");
			System.out.println("--------------------byte data type range /1 byte/ ---------------------");
			System.out.println(Byte.MIN_VALUE);
			System.out.println(Byte.MAX_VALUE);

			System.out.println("--------------------short data type range /2 byte/ ---------------------");
			System.out.println(Short.MIN_VALUE);
			System.out.println(Short.MAX_VALUE);

			System.out.println("---------------------integer data type range /4 byte/ ---------------------");
			System.out.println(Integer.MIN_VALUE);
			System.out.println(Integer.MAX_VALUE);
	
			System.out.println("--------------------Long data type range /8 byte/ ---------------------");
			System.out.println(Long.MIN_VALUE);
			System.out.println(Long.MAX_VALUE);

		// decimal numbers
			//float

			float $salary=14300.23F;		//f or F
			System.out.println("--------------------float data type range /4 byte/ ---------------------");
			System.out.println($salary);
			System.out.println(Float.MIN_VALUE);
			System.out.println(Float.MAX_VALUE);
			
			//double

			double $com=1232.32;	//bedefault double 
			System.out.println("--------------------double data type range /8 byte/ ---------------------");
			System.out.println($com);
			System.out.println(Double.MIN_VALUE);
			System.out.println(Double.MAX_VALUE);


		//characters
			//char
			
			char let='x';
			System.out.println("--------------------char data type /1 byte/ ---------------------");
			System.out.println(let);

		//Booleans
			//boolean

			boolean Istrue=true;
			boolean Isfalse=false;
			System.out.println(Istrue);
			System.out.println(Isfalse);

		//string
			System.out.println("------------------2 - non primitive data type-----------------------");
			System.out.println("------------------String data type-----------------------");
			String name="john due";
			System.out.println(name);

		//array
			System.out.println("------------------array data type-----------------------");
			int[] numbers={1,2,3,4,5};
			System.out.println(Arrays.toString(numbers));

		
		//class
		//Student student = new Student(); 
		// `Student` is a user-defined class.
	}
} 