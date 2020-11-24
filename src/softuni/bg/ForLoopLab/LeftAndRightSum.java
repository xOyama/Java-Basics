package softuni.bg.ForLoopLab;
import java.util.Scanner;
public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int leftSum=0;
        int rightSum=0;

        for (int i = 0; i < 2*n; i++) {
            int number = Integer.parseInt(sc.nextLine());
            if (i < n){
                leftSum+=number;
            }else{
                rightSum+=number;
            }

        }

        if (leftSum==rightSum){
            System.out.printf("Yes, sum = %d\n" ,leftSum);
        }else{
            System.out.printf("No, diff = %d\n" , Math.abs(leftSum-rightSum));
        }

    }
}
