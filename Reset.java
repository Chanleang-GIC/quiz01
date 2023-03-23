import java.util.Scanner;
public class Reset {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your current password: ");
        String currentPassword = scanner.nextLine();

        System.out.println("Please enter your new password: ");
        String newPassword = scanner.nextLine();

        System.out.println("Please confirm your new password: ");
        String confirmPassword = scanner.nextLine();

        if (newPassword.equals(confirmPassword)) {
            System.out.println("Your password has been successfully reset!");
        } else {
            System.out.println("The passwords do not match, please try again.");
        }

    }
}
