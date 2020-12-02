package softuni.bg.WhileLoopLab;
import java.util.Scanner;
public class AccountBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        double totalSum = 0.0;

        while (!input.equals("NoMoreMoney")){
            double number = Double.parseDouble(input);
            if (number < 0){
                System.out.println("Invalid operation!");
                break;
            }
            totalSum += number;
            System.out.printf("Increase: %.2f\n", number);
            input = sc.nextLine();
        }
        System.out.printf("Total: %.2f", totalSum);

    }
}
