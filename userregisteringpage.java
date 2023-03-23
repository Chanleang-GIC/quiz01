import java.util.Scanner;
public class userregisteringpage {
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String username, password;
    System.out.println("This is the user register page ");
    System.out.println("Input your name : ");
    username = sc.nextLine();
    System.out.println("Input a password");
    password = sc.nextLine();
    System.out.println("Account created successfully");
}
}
