class LoopsEx{
	public static void main(String[] args){
		
		//while loop
		System.out.println("using while loop");
		int i = 1;
		while(i<=5){
			System.out.println(i);
			i++;
		}

		//do while loop
		System.out.println("using do while loop");
		int j=1;
		do{
			System.out.println(j);
			j++;
		}while(j<=5);

		//for loop
		System.out.println("using for loop");
		int k=1;
		for(k=1;k<=5;k++){
			System.out.println(k);
		}

		//for each loop
		System.out.println("using for each loop");
		int[] numbers={1,2,3,4,5};
		for(int num:numbers){
			System.out.println(num);
		}		

	}
} 	