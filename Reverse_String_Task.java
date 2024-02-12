package Reverse_String.org;

public class Reverse_String_Task {

	public static void main(String[] args) {
		
		String S1 = "Hello";
		int index = S1.length()-1;
		
		for (int i = index; i >= 0; i--) {
			System.out.print(S1.charAt(i));		
		}
	}
}
