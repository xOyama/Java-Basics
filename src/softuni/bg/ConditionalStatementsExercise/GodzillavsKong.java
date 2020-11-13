package softuni.bg.ConditionalStatementsExercise;

import java.util.Scanner;

public class GodzillavsKong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());
        int statists = Integer.parseInt(sc.nextLine());
        double statistsClothingPrice = Double.parseDouble(sc.nextLine());

        double statistsCost = statists * statistsClothingPrice;
        double filmDecor = budget * 0.10;
        double price = filmDecor + statistsCost;

        if (statists >= 150) {
            double statistsClothingDiscount = statistsCost - statistsCost * 0.10;
            price = filmDecor + statistsClothingDiscount;
            if (price > budget) {
                System.out.println("Not enough money!");
                System.out.printf("Wingard needs %.02f leva more.", price - budget);

            } else {

                System.out.println("Action!");
                System.out.printf("Wingard starts filming with %.02f leva left.", budget - price);
            }

        } else {
            if (price > budget) {
                System.out.println("Not enough money!");
                System.out.printf("Wingard needs %.02f leva more.", price - budget);
            } else {

                System.out.println("Action!");
                System.out.printf("Wingard starts filming with %.02f leva left.", budget - price);
            }
        }
    }
}