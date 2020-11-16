package softuni.bg.ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class FruitShop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String fruit = sc.nextLine();
        String day = sc.nextLine();
        double amount = Double.parseDouble(sc.nextLine());
        double price = 0.0;

        if (day.matches("Sunday|Saturday")) {

            switch (fruit) {
                case "banana":
                    price = 2.70;System.out.printf("%.2f", price * amount);break;
                case "apple":
                    price = 1.25;System.out.printf("%.2f", price * amount);break;
                case "orange":
                    price = 0.90;System.out.printf("%.2f", price * amount);break;
                case "grapefruit":
                    price = 1.60;System.out.printf("%.2f", price * amount);break;
                case "kiwi":
                    price = 3.00;System.out.printf("%.2f", price * amount);break;
                case "pineapple":
                    price = 5.60;System.out.printf("%.2f", price * amount);break;
                case "grapes":
                    price = 4.20;System.out.printf("%.2f", price * amount);break;

                default:
                    System.out.println("error");
            }


        } else if (day.matches("Monday|Tuesday|Wednesday|Thursday|Friday")) {

            switch (fruit) {
                case "banana":
                    price = 2.50;System.out.printf("%.2f", price * amount);break;
                case "apple":
                    price = 1.20;System.out.printf("%.2f", price * amount);break;
                case "orange":
                    price = 0.85;System.out.printf("%.2f", price * amount);break;
                case "grapefruit":
                    price = 1.45;System.out.printf("%.2f", price * amount);break;
                case "kiwi":
                    price = 2.70;System.out.printf("%.2f", price * amount);break;
                case "pineapple":
                    price = 5.50;System.out.printf("%.2f", price * amount);break;
                case "grapes":
                    price = 3.85;System.out.printf("%.2f", price * amount);break;
                default:
                    System.out.println("error");
            }


        }


        else {
            System.out.println("error");
        }


    }
}