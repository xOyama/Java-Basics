package softuni.bg.ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class HotelRoom {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String month = sc.nextLine();
        int nights = Integer.parseInt(sc.nextLine());

        double studio = 0.0;
        double apartment = 0.0;

        switch (month) {
            case "May":
            case "October":
                studio = 50;
                apartment = 65;
                break;
            case "June":
            case "September":
                studio = 75.20;
                apartment = 68.70;
                break;
            case "July":
            case "August":
                studio = 76;
                apartment = 77;
                break;
        }

        double studioPrice = studio * nights;
        double apartmentPrice = apartment * nights;

        if (nights > 14) {
            apartmentPrice *= 0.90;
        }

        if (nights > 7 && nights < 14 && month.matches("May|October")) {
            studioPrice *= 0.95;
        } else if (nights > 14 && month.matches("May|October")) {
            studioPrice *= 0.70;
        } else if (nights > 7 && month.matches("June|September")) {
            studioPrice *= 0.80;
        }

        //if (month.matches("May|October")){
        //    if(nights > 7 && nights < 14){
        //        studioPrice *= 0.95;
        //    }
        //    else if(nights > 14){
        //        studioPrice *= 0.70;
        //    }
        //}
        //
        //if(month.matches("June|September")){
        //    if( nights > 7){
        //        studioPrice *= 0.80;
        //    }
        //}


        System.out.printf("Apartment: %.2f lv.%n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);

    }
}
