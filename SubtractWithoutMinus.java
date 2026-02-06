import java.util.Scanner;

public class SubtractWithoutMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // a - b = a + (~b + 1)
        int negB = ~b + 1;

        while (negB != 0) {
            int carry = a & negB;
            a = a ^ negB;
            negB = carry << 1;
        }

        System.out.println(a);
    }
}
