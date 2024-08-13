import java.util.Scanner;

class CheckDataType {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter the string : ");
			String string = scanner.nextLine();
			System.out.print("Enter the character : ");
			char ch = scanner.next().charAt(0);
			System.out.print("Enter the integer : ");
			int integer = scanner.nextInt();
			System.out.print("Enter the float : ");
			float fl = scanner.nextFloat();
			System.out.print("Enter the double : ");
			double db = scanner.nextDouble();
			System.out.print("Enter long : ");
			long lg = scanner.nextLong();

			System.out.println();
			System.out.println(string +" is type of " + ((Object)string).getClass().getSimpleName());
			System.out.println(ch +" is type of " + ((Object)ch).getClass().getSimpleName());
			System.out.println(integer +" is type of " + ((Object)integer).getClass().getSimpleName());
			System.out.println(fl +" is type of " + ((Object)fl).getClass().getSimpleName());
			System.out.println(db +" is type of " + ((Object)db).getClass().getSimpleName());
			System.out.println(lg +" is type of " + ((Object)lg).getClass().getSimpleName());
		}
	}
	
}