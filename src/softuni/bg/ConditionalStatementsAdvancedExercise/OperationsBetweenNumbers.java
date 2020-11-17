package softuni.bg.ConditionalStatementsAdvancedExercise;
import java.util.Scanner;
public class OperationsBetweenNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());
        String operator = sc.nextLine();
        double result = 0.0;
        String type = "";

        //Getting result

        switch (operator){

            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = (double) num1 / num2;
                break;
            case "%":
                result = (double) num1 % num2;
                break;
        }

        // Checking if result is even or odd
        if (result % 2 ==0){
            type = "even";
        }else {
            type = "odd";
        }

        // Printing
        switch (operator){
            case "+":
            case "-":
            case "*":
                System.out.printf("%d %s %d = %.0f - %s" , num1 ,operator , num2 , result , type );
                break;
            case "/":
                if( num2 == 0 ){
                    System.out.printf("Cannot divide %s by zero" , num1);
                }else {
                    System.out.printf("%s / %s = %.2f", num1, num2, result);
                }
                break;
            case "%":
                if( num2 == 0 ){
                    System.out.printf("Cannot divide %s by zero" , num1);
                }else {
                    System.out.printf("%s %% %s = %.0f", num1, num2, result);
                }
                break;
        }



    }
}
