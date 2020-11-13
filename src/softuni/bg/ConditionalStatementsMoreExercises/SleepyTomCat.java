package softuni.bg.ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class SleepyTomCat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int offDays = Integer.parseInt(sc.nextLine());
        int workDays = 365 - offDays;
        int totalPlayTime = (workDays * 63 + offDays * 127);
        int tomNorm = 30000;
        int hoursTotal = Math.abs(tomNorm - totalPlayTime);
        int hoursLeft = (int)Math.floor( hoursTotal / 60 );
        int minutesLeft = hoursTotal % 60;

        if (tomNorm> totalPlayTime){

            System.out.println("Tom sleeps well");
            System.out.printf("%s hours and %s minutes less for play" , hoursLeft , minutesLeft);

        }
        else{
            //int timeNeeded = hoursTotal - tomNorm;
            //int hoursLeftNeeded = (int)Math.floor(timeNeeded/60);
            //int minutesLeftNeeded = timeNeeded % 60;
            System.out.println("Tom will run away");
            System.out.printf("%s hours and %s minutes more for play" , hoursLeft , minutesLeft  );
        }
    }
}