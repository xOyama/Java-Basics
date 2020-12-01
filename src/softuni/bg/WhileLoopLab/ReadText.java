package softuni.bg.WhileLoopLab;
import java.util.Scanner;
public class ReadText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        while (!word.equals("Stop")){
            System.out.println(word);
            word = sc.nextLine();

        }

    }
}
