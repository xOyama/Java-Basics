package softuni.bg.ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class FishingBoat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int budget = Integer.parseInt(sc.nextLine());
        String season = sc.nextLine();
        int fishermenCount = Integer.parseInt(sc.nextLine());

        double price = 0.0;

        switch (season) {
            case "Spring":
                price = 3000;
                break;
            case "Summer":
            case "Autumn":
                price = 4200;
                break;
            case "Winter":
                price = 2600;
                break;
        }

        if (fishermenCount <= 6) {
            price *= 0.90;
        } else if (fishermenCount <= 11) {
            price *= 0.85;
        } else if (fishermenCount >= 12) {
            price *= 0.75;
        }

        if (fishermenCount % 2 == 0 && !season.equals("Autumn")) {
            price *= 0.95;
        }

        String output = "";
        if (budget >= price) {
            output = String.format("Yes! You have %.02f leva left.", budget - price);
        } else {
            output = String.format("Not enough money! You need %.02f leva.", price - budget);
        }

        System.out.println(output);

    }
}
