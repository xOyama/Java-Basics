package softuni.bg.ConditionalStatementsExercise;

import java.util.Scanner;

public class GodzillaVsKongSoft {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());
        int people = Integer.parseInt(sc.nextLine());
        double clothePrice = Double.parseDouble(sc.nextLine());

        double decor = budget * 0.10;
        double totalClothesPrice = clothePrice * people;
        String output = "";

        if (people > 150) {
            totalClothesPrice *= 0.90;
        }

        double expenses = decor + totalClothesPrice;

        if (expenses > budget) {
            output = String.format("Not enough money!%n" + "Wingard needs %.2f leva more.", expenses - budget);
        } else {
            output = String.format("Action!%n" + "Wingard starts filming with %.2f leva left.", budget - expenses);
        }
        System.out.println(output);
    }
}