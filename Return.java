import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        int first = readnumber();
        int second = readnumber();

        int sum = first + second;
        System.out.println("Sum of the number is: " + sum);
    }

    public static int readnumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = input.nextInt();
        return number;
    }
}