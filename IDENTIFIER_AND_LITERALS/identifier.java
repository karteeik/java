class identifierExample{
	public static void main(String[] args){
		//An identifier in Java is the name used to identify variables, methods, classes, interfaces, and other elements in a program
		int age=10;	//must begin with letter (a-z & A-Z)
		double _salary=12763.32;	//must begin with (_)
		String $str="hello, java !";	//must begin with ($)
		
		System.out.println(age +"/"+ _salary+"/" + $str);

		//rules - after first_char can include any number,digit,symbol,underscores (reserved keywords not used,cases sensitive)
	}
}