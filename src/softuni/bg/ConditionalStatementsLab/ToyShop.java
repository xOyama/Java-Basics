package softuni.bg.ConditionalStatementsLab;

import java.util.Scanner;

public class ToyShop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double puzzlePrice = 2.60;
        double speakingDollPrice = 3.00;
        double stuffedBearPrice = 4.10;
        double minionPrice = 8.20;
        double truckPrice = 2.00;

        double vacationPrice = Double.parseDouble(sc.nextLine());
        double puzzleCount = Double.parseDouble(sc.nextLine());
        double speakingDollCount = Double.parseDouble(sc.nextLine());
        double stuffedBearCount = Double.parseDouble(sc.nextLine());
        double minionCount = Double.parseDouble(sc.nextLine());
        double truckCount = Double.parseDouble(sc.nextLine());

        double totalCount = puzzleCount + speakingDollCount + stuffedBearCount + minionCount +truckCount;
        double totalPrice =
                ( puzzlePrice * puzzleCount ) +
                ( speakingDollPrice * speakingDollCount ) +
                ( stuffedBearPrice * stuffedBearCount ) +
                ( minionPrice * minionCount ) +
                ( truckPrice * truckCount ) ;

        if(totalCount>=50){

            totalPrice = totalPrice - totalPrice * 0.25;
        }
        totalPrice = totalPrice - totalPrice * 0.10;

        if(totalPrice>=vacationPrice){
            System.out.printf("Yes! %.2f lv left.", totalPrice-vacationPrice);
        }
        else
            System.out.printf("Not enough money! %.2f lv needed.", vacationPrice-totalPrice);
    }
}