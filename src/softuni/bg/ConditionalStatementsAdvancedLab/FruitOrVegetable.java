package softuni.bg.ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class FruitOrVegetable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        switch (word) {
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit");
                break;

            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.println("vegetable");
                break;

            default:
                System.out.println("unknown");

        }
    }
}