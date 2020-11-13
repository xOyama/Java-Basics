package softuni.bg.ConditionalStatementsExercise;
import java.util.Scanner;

public class BonusScore {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = Integer.parseInt(sc.nextLine());
        double pointsBonus = 0;
        //double pointsBonusOne = x + 5;
        //double pointsBonusTwo = x + x * 0.20;
        //double pointsBonusThree = x + x * 0.10;

        if (x <= 100){
            pointsBonus = 5;
        }
        else if (x > 1000){
            pointsBonus = x * 0.10;
        }
        else{
            pointsBonus = x * 0.20;
        }
        if (x % 2 == 0){
            pointsBonus = pointsBonus + 1;
        }
        else if(x % 10 == 5){
            pointsBonus = pointsBonus + 2;
        }
        System.out.println(pointsBonus);
        System.out.println(x + pointsBonus);
    }
}
