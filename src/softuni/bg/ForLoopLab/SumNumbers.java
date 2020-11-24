package softuni.bg.ForLoopLab;
import java.util.Scanner;
public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int totalSum=0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(sc.nextLine());
            totalSum+=num;

        }
        System.out.println(totalSum);
    }
}
