		// A class is a template that specifies the attributes and behavior of things or objects. 	
		//syntax - 

		/*class ClassName {
 			Datatype variable1;
 			Datatype variable2;
 			Datatype variableN;
 			
			return_type methodname1 (parameter-list) {
 				// body of method
 			}
 			return_type methodname2(parameter-list) {
 				// body of method
 			}
 			………………
 			return_type methodnameN(parameter-list) {
 				// body of method
 			}
		} */
class index{
	
	//data and values
	double height=1;
	double width=2;
	double depth=3;
	
	//methods syntax
	/*return_type method_name(parameter-list) {
		  body of method
	}*/

	//method
	double display(){
		return  height*width*depth;	
	}

	public static void main(String[] args){
		index obj=new index(); 		//created object
		double result=obj.display();		//method call syntax - var_name = object_name.method_name(parameter-list); 
		System.out.println(result);
	}
}