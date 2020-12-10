package softuni.bg.NestedLoopsLab;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int x = 1; x < 11; x++) {
            for (int y = 1; y < 11; y++) {

                int sum = x * y;
                System.out.printf("%d * %d = %d\n" , x , y , sum);

            }

        }

    }
}
