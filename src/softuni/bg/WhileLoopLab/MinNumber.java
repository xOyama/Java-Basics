package softuni.bg.WhileLoopLab;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int min = Integer.MAX_VALUE;

        while (!input.equals("Stop")) {
            int number = Integer.parseInt(input);
            if (number < min) {
                min = number;

            }
            input=sc.nextLine();
        }
        System.out.println(min);

    }
}
