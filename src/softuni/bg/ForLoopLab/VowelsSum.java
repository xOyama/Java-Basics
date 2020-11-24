package softuni.bg.ForLoopLab;
import java.util.Scanner;
public class VowelsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int totalSum = 0;
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            switch (letter){
                case 'a':totalSum+=1;break;
                case 'e':totalSum+=2;break;
                case 'i':totalSum+=3;break;
                case 'o':totalSum+=4;break;
                case 'u':totalSum+=5;break;


            }
        }

        System.out.println(totalSum);



    }
}
