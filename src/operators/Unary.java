package operators;

public class Unary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value=10;
		
		//Unary minus
		System.out.println("Unary Minus is : "+(-value));
		
		//Unary plus
		System.out.println("Unary plus is : "+(+value));
		
		//Unary pre increment=> increment the value before using it
		System.out.println("Pre-increments : "+(++value));
		
		//Unary post increment=> increment the value after using it
		System.out.println("Post-increment : "+(value++));
		
		//Unary pre decriment=> decrement the value before using it
		System.out.println("Pre- Decrement : "+(--value));
		
		//Unary post decriment=> decrement the value after using it
		System.out.println("Post decrement : "+(value--));
	}

}
