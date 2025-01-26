import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        do {
            System.out.print("Podaj liczbę elementów tablicy (n >= 2): ");
             n = scan.nextInt();
        }while (n < 2);

        int[] arr = new int[n];
        System.out.println("Podaj elementy tablicy (w porządku niemalejącym):");

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }


        int count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                count++;
            }
        }

        System.out.println("Liczba różnych wartości w tablicy: " + count);

    }
}