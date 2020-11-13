package softuni.bg.ConditionalStatementsExercise;

import java.util.Scanner;

public class TimePlus15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hours = Integer.parseInt(sc.nextLine());
        int minutes = Integer.parseInt(sc.nextLine());

        int totalMinutes = hours * 60 + minutes;
        int bonusMinutes = totalMinutes + 15;
        int leftHours = bonusMinutes / 60;
        int leftMinutes = bonusMinutes % 60;

        if (leftHours == 24) {
            leftHours = 0;
            System.out.printf("%d:%02d", leftHours, leftMinutes);
        } else {
            System.out.printf("%d:%02d", leftHours, leftMinutes);
        }

    }
}
