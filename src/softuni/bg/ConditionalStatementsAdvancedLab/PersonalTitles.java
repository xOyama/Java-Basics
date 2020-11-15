package softuni.bg.ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class PersonalTitles {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double age = Double.parseDouble(sc.nextLine());
        String gender = sc.nextLine();

        if ("m".equals(gender)) {
            if (age >= 16) {
                System.out.println("Mr.");
            } else {
                System.out.println("Master");
            }
        } else if ("f".equals(gender)) {
            if (age >= 16) {
                System.out.println("Ms.");
            } else {
                System.out.println("Miss");
            }
        }
    }
}
