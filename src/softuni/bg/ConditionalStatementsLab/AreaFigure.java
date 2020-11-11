package softuni.bg.ConditionalStatementsLab;

import java.util.Scanner;

public class AreaFigure {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String figure = sc.nextLine();

        if(figure.equalsIgnoreCase("square")){
            double a = Double.parseDouble(sc.nextLine());
            double result = a*a;
            System.out.printf("%.3f",result);
        }
        else if(figure.equalsIgnoreCase("rectangle")){
            double a = Double.parseDouble(sc.nextLine());
            double b = Double.parseDouble(sc.nextLine());
            double result = a*b;
            System.out.printf("%.3f",result);
        }
        else if(figure.equalsIgnoreCase("circle")){
            double r = Double.parseDouble(sc.nextLine());
            double result = Math.PI * (Math.pow(r,2));
            System.out.printf("%.3f",result);
        }

        else if(figure.equalsIgnoreCase("triangle")){
            double a = Double.parseDouble(sc.nextLine());
            double ha = Double.parseDouble(sc.nextLine());
            double result = a*ha/2;
            System.out.printf("%.3f",result);
        }

    }
}

