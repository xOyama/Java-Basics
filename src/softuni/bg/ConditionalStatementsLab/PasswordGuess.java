package softuni.bg.ConditionalStatementsLab;

import java.util.Scanner;

public class PasswordGuess {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String realPassword = "s3cr3t!P@ssw0rd";
        String userPassword = sc.nextLine();

        if(realPassword.equals(userPassword)){
            System.out.println("Welcome");
        }
        else{
            System.out.println("Wrong password!");
        }
    }
}