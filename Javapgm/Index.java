import java.util.Scanner;

class Index{
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the name ");
            String name = scanner.nextLine();

            System.out.println("Enter the age of the student ");
            int age = Integer.parseInt(scanner.nextLine());


            System.out.println("The name os the student is : "+ name);

            System.out.println("The age of the student is : "+ age);
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        int a = 10;
        int b = 30;

        System.out.println(a);
        System.out.println(b);
    }
}
