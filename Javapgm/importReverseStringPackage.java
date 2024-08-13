import java.util.Scanner;
import p1.ReverseString;

public class importReverseStringPackage  {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter the string : ");
			String stringName = scanner.nextLine();
			System.out.println("The reversed string is : " + ReverseString.reverse(stringName));
		}
		
	}
	
}