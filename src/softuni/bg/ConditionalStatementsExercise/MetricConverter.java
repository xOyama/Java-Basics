package softuni.bg.ConditionalStatementsExercise;

import java.util.Scanner;

public class MetricConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x = Double.parseDouble(sc.nextLine());
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();


        if (num1.equals("mm")) {
            x = x / 1000;

        } else if (num1.equals("cm")) {
            x = x / 100;
        }

        if (num2.equals("mm")) {
            x = x * 1000;
        } else if (num2.equals("cm")) {
            x = x * 100;
        }
        System.out.printf("%.3f" , x);
    }
}
