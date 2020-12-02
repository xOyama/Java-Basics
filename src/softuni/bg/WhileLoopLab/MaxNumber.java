package softuni.bg.WhileLoopLab;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int max = Integer.MIN_VALUE;

        while (!input.equals("Stop")) {
            int number = Integer.parseInt(input);
            if (number > max) {
                max = number;

            }
            input=sc.nextLine();
        }
        System.out.println(max);

    }
}
