//Java provides several access modifiers to define visibility and access levels for classes, variables, methods, and constructors.
// modifiers		class 	package	sub-class world
// public			  y    		     y 		      y		    y
// protected		  y		     y		      y		    n
// default (no)		  y		     y  	      n	    n
// private			  y		     n               n            n

class AccessModifierEx{

		public int a=10;
		protected int b=20;
		int c=30;
		private int d=40;
	
		void display(){
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
		}

	public static void main(String[] args){
		
		AccessModifierEx obj=new AccessModifierEx();
		obj.display();
	}
}