package softuni.bg.ConditionalStatementsLab;

import java.util.Scanner;

public class EvenorOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.next());

        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
