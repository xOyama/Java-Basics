package softuni.bg.ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class WorkingHours {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hours = Integer.parseInt(sc.nextLine());
        String day = sc.nextLine();

        if (hours >= 10 && hours <= 18) {
            if (!day.equalsIgnoreCase("Sunday")) {
                System.out.println("open");

            } else {
                System.out.println("closed");
            }
        }
        else{
            System.out.println("closed");
        }
    }
}