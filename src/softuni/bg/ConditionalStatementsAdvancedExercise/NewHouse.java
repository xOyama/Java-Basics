package softuni.bg.ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class NewHouse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String flowers = sc.nextLine();
        int numFlowers = Integer.parseInt(sc.nextLine());
        int budget = Integer.parseInt(sc.nextLine());

        double price = 0.0;

        switch (flowers) {
            case "Roses":
                price = 5 * numFlowers;
                if (numFlowers > 80) {
                    price *= 0.90;
                }
                break;
            case "Dahlias":
                price = 3.80 * numFlowers;
                if (numFlowers > 90) {
                    price *= 0.85;
                }
                break;
            case "Tulips":
                price = 2.80 * numFlowers;
                if (numFlowers > 80) {
                    price *= 0.85;
                }
                break;
            case "Narcissus":
                price = 3.00 * numFlowers;
                if (numFlowers < 120) {
                    price *= 1.15;
                }
                break;
            case "Gladiolus":
                price = 2.50 * numFlowers;
                if (numFlowers < 80) {
                    price *= 1.20;
                }
                break;
        }

        String output = "";

        if (budget >= price) {
            output = String.format("Hey, you have a great garden with %d %s and %.2f leva left.", numFlowers, flowers, budget - price);
        } else {
            output = String.format("Not enough money, you need %.2f leva more.", price - budget);
        }

        System.out.println(output);

    }
}