package softuni.bg.ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class NumberInRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = Integer.parseInt(sc.nextLine());

        if(x >= -100 && x <= 100 && x != 0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}