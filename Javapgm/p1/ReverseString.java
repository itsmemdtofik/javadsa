package p1;

import java.util.Scanner;

public class ReverseString {

	public static String reverse(String s) {

		s = s.toLowerCase();
		String newString = "";
		for(int i = (s.length() - 1); i >= 0; i--) {
			newString = newString + s.charAt(i);
		}

		return newString;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.close();
	}
	
}