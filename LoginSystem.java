import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = "admin";
        String password = "1234";

        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Username: ");
            String u = sc.next();

            System.out.print("Password: ");
            String p = sc.next();

            if (u.equals(username) && p.equals(password)) {
                System.out.println("Login Successful");
                break;
            } else {
                attempts--;
                System.out.println("Wrong credentials. Attempts left: " + attempts);
            }
        }

        if (attempts == 0)
            System.out.println("Account Locked");
    }
}