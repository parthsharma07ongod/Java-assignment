import java.util.Scanner;

public class MaxWithoutCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int diff = a - b;
        int sign = (diff >> 31) & 1;

        int max = a - sign * diff;
        System.out.println(max);
    }
}
