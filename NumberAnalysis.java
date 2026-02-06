import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int temp = n, reverse = 0, sum = 0, count = 0;

        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            sum += digit;
            count++;
            temp /= 10;
        }

        System.out.println("Reverse: " + reverse);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Count of digits: " + count);
    }
}
