package softuni.bg.WhileLoopExercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int dailyQuota = 10000;
        int totalSteps = 0;


        while (totalSteps < dailyQuota) {

            if (input.equals("Going home")) {
                int homeSteps = Integer.parseInt(sc.nextLine());
                totalSteps += homeSteps;
                break;
            }

            int steps = Integer.parseInt(input);

            totalSteps += steps;

            if (totalSteps >= dailyQuota){
                break;
            }

            input = sc.nextLine();


        }




        if (totalSteps > dailyQuota) {
            System.out.printf("Goal reached! Good job!\n%d steps over the goal!", totalSteps - dailyQuota);
        } else {
            System.out.printf("%d more steps to reach goal.", Math.abs(totalSteps - dailyQuota));
        }

    }
}
