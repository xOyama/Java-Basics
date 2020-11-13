package softuni.bg.ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class PipesInPool {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int v = Integer.parseInt(sc.nextLine());
        int p1 = Integer.parseInt(sc.nextLine());
        int p2 = Integer.parseInt(sc.nextLine());
        double h = Double.parseDouble(sc.nextLine());

        double paump = (p1 + p2) * h;

        if (paump > v) {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", h , paump - v );
        } else {
            double full = (paump / v) * 100;
            double p3 = p1 + p2;
            double procp1 = p1 / p3 * 100;
            double procp2 = p2 / p3 * 100;
            System.out.printf("The pool is %.2f%% full."+" Pipe 1: %.2f%%."+ " Pipe 2: %.02f%%." , full , procp1 , procp2);
        }
    }
}
/// java do be woozy