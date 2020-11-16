package softuni.bg.ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class TradeCommissions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String city = sc.nextLine();
        double volume = Double.parseDouble(sc.nextLine());
        double procent = 0.0;

        if (volume > 0 && volume <= 500) {
            switch (city) {

                case "Sofia":
                    procent = 0.050;
                    System.out.printf("%.02f", volume * procent);
                    break;
                case "Varna":
                    procent = 0.045;
                    System.out.printf("%.02f", volume * procent);
                    break;
                case "Plovdiv":
                    procent = 0.055;
                    System.out.printf("%.02f", volume * procent);
                    break;
                default:
                    System.out.println("error");


            }
        } else if (volume > 500 && volume <= 1000) {
            switch (city) {

                case "Sofia":
                    procent = 0.07;
                    System.out.printf("%.02f", volume * procent);
                    break;
                case "Varna":
                    procent = 0.075;
                    System.out.printf("%.02f", volume * procent);
                    break;
                case "Plovdiv":
                    procent = 0.08;
                    System.out.printf("%.02f", volume * procent);
                    break;
                default:
                    System.out.println("error");
            }
        } else if (volume > 1000 && volume <= 10000) {
            switch (city) {

                case "Sofia":
                    procent = 0.08;
                    System.out.printf("%.02f", volume * procent);
                    break;
                case "Varna":
                    procent = 0.10;
                    System.out.printf("%.02f", volume * procent);
                    break;
                case "Plovdiv":
                    procent = 0.12;
                    System.out.printf("%.02f", volume * procent);
                    break;
                default:
                    System.out.println("error");
            }
        } else if (volume > 10000) {
            switch (city) {

                case "Sofia":
                    procent = 0.12;
                    System.out.printf("%.02f", volume * procent);
                    break;
                case "Varna":
                    procent = 0.13;
                    System.out.printf("%.02f", volume * procent);
                    break;
                case "Plovdiv":
                    procent = 0.145;
                    System.out.printf("%.02f", volume * procent);
                    break;
                default:
                    System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
    }
}