package Reverse_String.org;

public class Reverse_String_Task2 {

	public static void main(String[] args) {
		
		String S = "HARISHKUTTI";
		int index = S.length()-1;
		
		for (int i = index; i >= 0; i--) {
			
			System.out.print(S.charAt(i));
			
		}
	}
}