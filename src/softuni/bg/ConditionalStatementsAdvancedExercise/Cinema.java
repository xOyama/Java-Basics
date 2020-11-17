package softuni.bg.ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String projection = sc.nextLine();
        int rows = Integer.parseInt(sc.nextLine());
        int columns = Integer.parseInt(sc.nextLine());
        double income = 0.0;

        if (projection.equals("Premiere")) {
            income = rows * columns * 12;
        } else if (projection.equals("Normal")) {
            income = rows * columns * 7.50;
        } else if (projection.equals("Discount")) {
            income = rows * columns * 5;
        }
        System.out.printf( "%.2f" , income );

    }
}
