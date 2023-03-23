package quiz01;
import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;
public class landingpage {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int option;
    System.out.println("""
            This is landing page:
            Select your option:
            1.First/Landing page
            2.User registering page
            3.User reset password page
            4. User login page
            5. List of test results for a User
            6. User typing test page
            7. About us page
            8. README.md
            """);
            option = sc.nextInt();
            switch(option){
                case 1:
                System.out.println("Landing page");
                break;
                case 3:
                System.out.println("https://github.com/Chanleang-GIC/quiz01/blob/50f23e54ac9605a7e925c95451b778b4d45d6d43/userloginpage.java");
                break;
                case 2:
                System.out.println("https://github.com/Chanleang-GIC/quiz01/blob/50f23e54ac9605a7e925c95451b778b4d45d6d43/userregisteringpage.java");
                case 4:
                System.out.println("https://github.com/Chanleang-GIC/quiz01/blob/0f1e7da943c5a997e2680e1704e816ec8bd7563c/Reset.java");
                break;
                case 5:
                System.out.println("wait");
                break;
                case 6:
                System.out.println("wait");
                break;
                case 7:
                System.out.println("https://github.com/Chanleang-GIC/quiz01/blob/0f1e7da943c5a997e2680e1704e816ec8bd7563c/aboutus.txt");
                break;
                case 8:
                System.out.println("https://github.com/Chanleang-GIC/quiz01/blob/0f1e7da943c5a997e2680e1704e816ec8bd7563c/README.md");
                break;
            }
}
}
