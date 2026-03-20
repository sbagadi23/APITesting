package features;

public class Test2 {
	
public static void main(String[] args) {
	
	String str = "Hellow World";
	String reversed = "";
	
	for (int i = str.length() - 1; i >= 0; i--) {
		reversed += str.charAt(i);
	}
	
	System.out.println("Original String: " + reversed);
	
}

}
