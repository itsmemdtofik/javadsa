import java.util.*;
import java.lang.Math;

class PrimeNumberBetweenTwoNumber {
	public static boolean isPrime(int number){

		if(number <= 1){
			return false;
		}

		for(int i = 2; i <= Math.sqrt(number); i++){
			if(number % i == 0){
				return false;
			}
		}

		return true;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;

		System.out.print("Enter the first number : ");
		int firstNumber = scanner.nextInt();
		System.out.println();
		System.out.print("Enter the second number : ");
		int secondNumber = scanner.nextInt();
		System.out.println();

		List<Integer> list = new ArrayList<Integer>();

		System.out.print("List of prime number between " + firstNumber + " and "+ secondNumber + " is : ");
		for(int i = firstNumber; i <= secondNumber; i++){
			if(isPrime(i)){
				list.add(i);
				count++;
			}
		}
		System.out.println(list);

		System.out.println();
		if(count > 0){
			System.out.print("The total prime number between the number [ " + firstNumber +" ] and the number [ " + secondNumber +" ] is : " + count);
			System.out.println();
		}else{
			System.out.println("There is no prime number ");
		}
		
		scanner.close();
	}
	
}