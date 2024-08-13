import java.util.Scanner;
import java.lang.Math;

class DiceProgram {
	public static int fact(double d) {
		if (d == 1) {
			return (int) Math.pow(6, d);
		}

		return fact((Math.pow(6, d)) - 15);
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter the number of dice : ");
			int n = scanner.nextInt();

			int dice = fact(n);
			System.out.println(dice);
		}
	}

}