package Reverse_String.org;

public class Reverse_String {

	public static void main(String[] args) {

		String s = "Mohan Raj";
		int index = s.length() - 1;

		for (int i = index; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}

	}

}
