import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // when you want to read any string value after integer input always forward with 'scanner.nextLine()'

        System.out.print("Enter your city: ");
        String city =scanner.nextLine();

        System.out.println("your name is " + name + " your age is " + age + " and you are from " + city);
        scanner.close();
    }
}
