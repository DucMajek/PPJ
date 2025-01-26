import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        int[] tab;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 25) + 10;
                System.out.print(arr[i][j] + " ");
                count++;
            }
            System.out.println();
        }
        tab = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                tab[index++] = arr[i][j];
            }
            
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }

    }
}