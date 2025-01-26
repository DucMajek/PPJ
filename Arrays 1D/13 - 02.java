import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        do {
            System.out.print("Podaj liczbę elementów tablicy (n >= 2): ");
            n = scan.nextInt();
        } while (n < 2);

        int[] arr = new int[n];
        System.out.println("Podaj elementy tablicy (w porządku niemalejącym):");

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int tmp = arr[0];
        int maxCount = 1;
        int current = 1;
        for (int i = 1; i < n; i++) {
            if(arr[i] == arr[i - 1])
                current++;
            else
                current = 1;

            if(current > maxCount){
                maxCount = current;
               tmp = arr[i];
            }
        }

        System.out.println("Najczęściej występująca wartość: " + tmp);

    }
}