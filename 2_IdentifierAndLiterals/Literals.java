public class Literals {
	public static void main(String[] args) {
		// JAVA literals - Any constant value which can be assigned to the variable is
		// called as literal/constant.

		// integer literals(whole numbers)

		// All values represented 10 in different formate 
		int decimal = 10;
		int binary = 0b1010;
		int octal = 012;
		int hex = 0xA;
		System.out.println("integer literals(whole numbers)");
		System.out.println(decimal + "/" + binary + "/" + octal + "/" + hex);

		// floating point literals(decimal numbers)
		float pi = 3.14F;	// F or f both are valid 
		double g = 9.81;
		System.out.println("floating point literals(decimal numbers)");
		System.out.println(pi + "/" + g);

		// character literals(single character)
		char letter = 'A';
		char digit = '7';
		char special = '$';
		char unicode = '\u2764'; // Unicode character (❤)
		System.out.println("character literals(single character)");
		System.out.println(letter + "/" + digit + "/" + special + "/" + unicode);

		// String literals(text)
		String greeting = "Hello, Java!";
		System.out.println("String literals(text)");
		System.out.println(greeting);

		// boolean literals(true/false)
		boolean isJavaFun = true;
		boolean isSkyGreen = false;
		System.out.println("boolean literals(true/false)");
		System.out.println(isJavaFun + "/" + isSkyGreen);

		// null literals(null values only)
		String name = null;
		System.out.println("null literals(null values only)");
		System.out.println(name);

		// underscore in numeric literals
		int largeNumber = 1_000_000;
		double piValue = 3.141_592;
		System.out.println("underscore in numeric literals");
		System.out.println(largeNumber + "/" + piValue);

	}
}