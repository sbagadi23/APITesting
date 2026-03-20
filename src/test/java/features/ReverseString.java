package features;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello World";
		String reversed = "";
		
		System.out.println("String lenth: " + str.length());
		
		for(int i = str.length()-1; i >= 0; i--) {
			reversed += str.charAt(i);
		
		}
	
		System.out.println("Reverse String: " + reversed);
		

	}

}
