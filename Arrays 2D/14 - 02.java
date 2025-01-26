import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[1][2];
        int rollDice;
        String choice = "";
        int resize;
        int[][] tmp = new int[0][arr[0].length];

        while (!choice.equals("s")) {
            int size = tmp.length;
            resize = 1;

            // Tworzymy nową tablicę z większym rozmiarem
            int[][] newTmp = new int[size + resize][arr[0].length];

            // Kopiujemy stare wartości z tmp do newTmp
            for (int i = 0; i < tmp.length; i++) {
                for (int j = 0; j < tmp[i].length; j++) {
                    newTmp[i][j] = tmp[i][j]; 
                }
            }

            tmp = newTmp;

            System.out.println("Czy chcesz rzucic kostkami?");
            choice = scan.next();

            if (choice.equals("R") || choice.equals("r")) {
                for (int j = 0; j < arr[0].length; j++) {
                    rollDice = (int) (Math.random() * 6) + 1;
                    arr[0][j] = rollDice;

                    // Kopiujemy wynik losowania do ostatniego wiersza tmp
                    tmp[size][j] = arr[0][j];
                }
            } else if (choice.equals("s") || choice.equals("S")) {
                for (int i = 0; i < tmp.length; i++) {
                    for (int j = 0; j < tmp[i].length; j++) {
                        if (tmp[i][j] > 0)
                            System.out.print(tmp[i][j] + " ");
                    }
                    System.out.println();
                }

            }


        }
    }
}