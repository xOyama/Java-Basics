package softuni.bg.WhileLoopLab;
import java.util.Scanner;
public class GraduationPart2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int cls = 1;
        int fails = 0;
        double totalGrade = 0.0;
        boolean isFailedMoreThanOnce = false;

        while (cls <=12){
            double grade = Double.parseDouble(sc.nextLine());
                if (grade >= 4.00){
                    totalGrade+=grade;
                    cls++;
                    continue;
                }
                totalGrade+=grade;
                fails++;

                if (fails>1){
                    isFailedMoreThanOnce = true;
                    break;
                }

                 cls++;
        }

        if (isFailedMoreThanOnce){
            System.out.printf("%s has been excluded at %d grade " , name ,cls-1);
        }else{
            double averageGrade = totalGrade /12;
            System.out.printf("%s graduated. Average grade: %.2f " , name , averageGrade);
        }


    }
}
