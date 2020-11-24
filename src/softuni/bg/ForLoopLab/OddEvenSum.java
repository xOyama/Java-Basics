package softuni.bg.ForLoopLab;

import java.util.Scanner;

public class OddEvenSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int evenSum=0;
        int oddSum=0;


        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(sc.nextLine());
            if (i % 2 != 0){
                oddSum+= number;
            }else{
                evenSum+= number;
            }

        }

        if (evenSum==oddSum){
            System.out.printf("Yes\n" + "Sum = %d\n" , evenSum);
        }else{
            int diff = Math.abs(evenSum-oddSum);
            System.out.printf("No\n" + "Diff = %d\n" , diff);
        }

    }
}
