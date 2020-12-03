package softuni.bg.WhileLoopExercise;
import java.util.Scanner;
public class ExamPreparation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int poorGradesLimit = Integer.parseInt(sc.nextLine());

        String problemName = sc.nextLine();

        int poorGrades = 0;
        boolean isFailed = false;
        double allGradesSum = 0.0;
        int allGrades = 0;
        String lastProblem = "";

        while (!problemName.equals("Enough")){
            int grade = Integer.parseInt(sc.nextLine());
            allGrades++;
            allGradesSum += grade;

            if (grade <= 4){
                poorGrades++;
                if (poorGrades == poorGradesLimit){
                    isFailed = true;
                    lastProblem = problemName;
                    break;
                }
            }

            lastProblem = problemName;
            problemName = sc.nextLine();
        }

        double averageScore = allGradesSum / allGrades;

        String output = "";

        if (isFailed){
            output = String.format("You need a break, %d poor grades.", poorGrades);
        }else {
            output = String.format("Average score: %.2f%n"+
                    "Number of problems: %d%n"+
                    "Last problem: %s", averageScore , allGrades , lastProblem);
        }

        System.out.println(output);


    }
}
