import java.util.Scanner;

public class Work2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String sys_email = "admin@gmail.com";
        String sys_password = "Admin@123";

        String email, password;
        System.out.println("Enter your email");
        email = input.nextLine();
        System.out.println("Enter your password");
        password = input.nextLine();


        if (sys_email.equalsIgnoreCase(email) && sys_password.equals(password)){
            System.out.println("Login Successful");
        }else {
            System.out.println("wrong email or password");
        }
    }
}
