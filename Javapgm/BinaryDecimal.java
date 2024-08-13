import java.util.Scanner;
public class BinaryDecimal {

    public static void PrintDecimalToBinary(int number){
        int dbinary = 0;
        int dbase = 1;
        while(number != 0){
            int rem = number % 2;
            dbinary = dbinary + (rem * dbase);
            number = number / 2;
            dbase = dbase * 10;
        }

        System.out.print("The binary number from decimal number is : " + dbinary);
        System.out.println();
    }

    public static void PrintBinaryToDecimal(int number){
        int bdecimal = 0;
        int bbase = 1;
        while(number != 0){
            int rem = number % 10;
            bdecimal = bdecimal + (rem * bbase);
            number = number / 10;
            bbase = bbase * 2;
        }

        System.out.print("The decimal number from binary number is : " + bdecimal);
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the decimal number : ");
        int dnumber = scanner.nextInt();
        PrintDecimalToBinary(dnumber);
        System.out.println("--------------------------------------------");
        System.out.print("Enter the binary number : ");
        int bnumber = scanner.nextInt();
        PrintBinaryToDecimal(bnumber);
        System.out.println();
        scanner.close();
    }
}
