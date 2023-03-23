import java.util.Scanner;
public class Typingtest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the typing test!");
        System.out.println("Please type the following sentence: 'The quick brown fox jumps over the lazy dog'");
        String input = sc.nextLine();
        if (input.equals("The quick brown fox jumps over the lazy dog")) {
            System.out.println("Congratulations! You typed the sentence correctly!");
        } else {
            System.out.println("Sorry, that is not correct.");
        }
    }
}