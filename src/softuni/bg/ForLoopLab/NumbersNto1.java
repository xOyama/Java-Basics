package softuni.bg.ForLoopLab;
import java.util.Scanner;
public class NumbersNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = Integer.parseInt(sc.nextLine());

        for (int i = x; i >=1 ; i--) {
            System.out.println(i);
            
        }



    }
}
