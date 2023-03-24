import java.util.Scanner;



public class username {
    public static String help() {
        System.out.println("You need to create an account first");
        System.out.println("Fill the information and you will automatically login");
        System.out.println("Enter a username :");
        Scanner sc = new Scanner(System.in);
        String username1 = sc.nextLine();
        return username1;
    }
    public static String help1() {
        System.out.println("Enter a password : ");
        Scanner sc = new Scanner(System.in);
        String password1 = sc.nextLine();
        return password1;
    }

    }


