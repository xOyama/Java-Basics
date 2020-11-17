package softuni.bg.ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class FishingBoat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int budget = Integer.parseInt(sc.nextLine());
        String season = sc.nextLine();
        int fishermen = Integer.parseInt(sc.nextLine());

        double boat = 0.0;

        switch (season) {

            case "Spring":
                boat = 3000;
                if (fishermen <= 6) {
                    boat *= 0.90;
                } else if (fishermen >= 7 && fishermen <= 11) {
                    boat *= 0.85;
                } else if (fishermen >= 12) {
                    boat *= 0.75;
                }


                break;

            case "Summer":
                boat = 4200;
                if (fishermen <= 6) {
                    boat *= 0.90;
                } else if (fishermen >= 7 && fishermen <= 11) {
                    boat *= 0.85;
                } else if (fishermen >= 12) {
                    boat *= 0.75;
                }

                break;

            case "Autumn":

                boat = 4200;
                if (fishermen <= 6) {
                    boat *= 0.90;
                } else if (fishermen >= 7 && fishermen <= 11) {
                    boat *= 0.85;
                } else if (fishermen >= 12) {
                    boat *= 0.75;
                }

                break;

            case "Winter":
                boat = 2600;
                if (fishermen <= 6) {
                    boat *= 0.90;
                } else if (fishermen >= 7 && fishermen <= 11) {
                    boat *= 0.85;
                } else if (fishermen >= 12) {
                    boat *= 0.75;
                }
                break;
        }

        if (!(season.equals("Autumn"))) {
            if (fishermen % 2 == 0) {
                boat *= 0.95;
            }
        }


        String output = "";
        if (budget >= boat) {
            output = String.format("Yes! You have %.02f leva left.", budget - boat);
        } else {
            output = String.format("Not enough money! You need %.02f leva.", boat - budget);
        }

        System.out.println(output);
    }
}
