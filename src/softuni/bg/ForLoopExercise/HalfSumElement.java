package softuni.bg.ForLoopExercise;

import java.util.Scanner;

public class HalfSumElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int maxNumber = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(sc.nextLine());
            sum +=number;
            if (number > maxNumber){
                maxNumber = number;
            }

        }
        sum-=maxNumber;
        String output = "";
        if (sum == maxNumber){
            output = String.format("Yes%n" +
                    "Sum = %d", maxNumber);
        }else{
            output = String.format("No%n" +
                    "Diff = %d", Math.abs(sum-maxNumber));
        }
        System.out.println(output);
    }
}
