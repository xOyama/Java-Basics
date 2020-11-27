package softuni.bg.ForLoopExercise;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tabs = Integer.parseInt(sc.nextLine());
        int salary = Integer.parseInt(sc.nextLine());

        String output = "";

        for (int i = 0; i < tabs; i++) {
            String tab = sc.nextLine();

            switch (tab){
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;

            }

            if (salary <= 0){
                break;
            }
        }

        if (salary <= 0){
            output = "You have lost your salary.";
        }else{
            output = String.format("%d", salary);
        }

        System.out.println(output);




    }
}
