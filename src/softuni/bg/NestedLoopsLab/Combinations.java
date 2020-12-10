package softuni.bg.NestedLoopsLab;

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int validCombinationsCount = 0;


        for (int x = 0; x <= n; x++) {
            for (int y = 0; y <= n; y++) {
                for (int z = 0; z <= n; z++) {
                    int sum = x + y + z;

                    if (sum == n) {
                        validCombinationsCount++;
                    }

                }

            }
        }

        System.out.println(validCombinationsCount);
    }
}
