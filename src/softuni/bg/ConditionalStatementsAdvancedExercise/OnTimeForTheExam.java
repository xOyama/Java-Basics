package softuni.bg.ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class OnTimeForTheExam {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int examHour = Integer.parseInt(sc.nextLine());
        int examMinutes = Integer.parseInt(sc.nextLine());

        int arriveHour = Integer.parseInt(sc.nextLine());
        int arriveMinute = Integer.parseInt(sc.nextLine());

        int examTime = examHour * 60 + examMinutes;
        int arriveTime = arriveHour * 60 + arriveMinute;

        String output1 = "";
        String output2 = "";

        if (examTime >= arriveTime && arriveTime >= examTime - 30) {
            output1 = "On time";
            int difference = examTime - arriveTime;
            output2 = String.format("%d minutes before the start", difference);
        } else if (arriveTime < examTime - 30) {
            output1 = "Early";
            int difference = examTime - arriveTime;
            if (difference < 60) {
                output2 = String.format("%d minutes before the start", difference);
            } else {
                int hour = difference / 60;
                int minutes = difference % 60;
                output2 = String.format("%d:%02d hours before the start", hour, minutes);
            }
        } else if (arriveTime > examTime) {
            output1 = "Late";
            int difference = arriveTime - examTime;
            if (difference < 60) {
                output2 = String.format("%d minutes after the start", difference);
            } else {
                int hour = difference / 60;
                int minutes = difference % 60;
                output2 = String.format("%d:%02d hours after the start", hour, minutes);
            }
        }
        System.out.println(output1);
        System.out.println(output2);
    }
}