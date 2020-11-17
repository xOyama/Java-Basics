package softuni.bg.ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class SummerOutfit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int degrees = Integer.parseInt(sc.nextLine());
        String dayTime = sc.nextLine();
        String outfit = "";
        String shoes = "";

        if ("Morning".equals(dayTime)){
            if (degrees >= 10 && degrees <= 18){
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            }else if (degrees > 18 && degrees <= 24){
                outfit = "Shirt";
                shoes = "Moccasins";
            }else if(degrees >= 25 && degrees <= 42) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
            System.out.printf("It's %d degrees, get your %s and %s." , degrees , outfit ,  shoes);
        }

        if ("Afternoon".equals(dayTime)){
            if (degrees >= 10 && degrees <= 18){
                outfit = "Shirt";
                shoes = "Moccasins";
            }else if (degrees > 18 && degrees <= 24){
                outfit = "T-Shirt";
                shoes = "Sandals";
            }else if(degrees >= 25 && degrees <= 42) {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }
            System.out.printf("It's %d degrees, get your %s and %s." , degrees , outfit ,  shoes);
        }

        if ("Evening".equals(dayTime)){
            if (degrees >= 10 && degrees <= 18){
                outfit = "Shirt";
                shoes = "Moccasins";
            }else if (degrees > 18 && degrees <= 24){
                outfit = "Shirt";
                shoes = "Moccasins";
            }else if(degrees >= 25 && degrees <= 42) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
            System.out.printf("It's %d degrees, get your %s and %s." , degrees , outfit ,  shoes);
        }


    }
}