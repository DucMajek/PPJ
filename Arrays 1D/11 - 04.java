import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] tab = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int index;
        int tmp;
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println("\n================================");
        for (int i = 0; i < 5; i++) {
            index = (int) (Math.random() * tab.length);
            tmp = tab[i];
            tab[i] = tab[index];
            tab[index] = tmp;
        }


        System.out.println("\n================================");
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                System.out.print(j == tab[i] ? "* " : ". ");
            }
            System.out.println();
        }

    }
}

