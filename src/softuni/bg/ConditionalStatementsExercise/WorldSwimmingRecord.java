package softuni.bg.ConditionalStatementsExercise;

import java.util.Scanner;

public class WorldSwimmingRecord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double seconds = Double.parseDouble(sc.nextLine());
        double distance = Double.parseDouble(sc.nextLine());
        double time = Double.parseDouble(sc.nextLine());

        double travel = distance * time;
        double drawback = Math.floor(distance / 15) * 12.5;
        double totalTime = travel + drawback;

        if (seconds > totalTime) {
            System.out.printf("Yes, he succeeded! The new world record is %.02f seconds.", totalTime);
        } else {
            System.out.printf("No, he failed! He was %.02f seconds slower.", totalTime - seconds);
        }
    }
}