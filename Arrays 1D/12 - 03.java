public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{153, 333, 370, 515, 407, 80};
        int number = 0;
        int counter = 0;
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            number += arr[i];
            int originalNumber, remainder, result = 0;
            originalNumber = number;
            tmp = number;
            while (tmp != 0) {
                tmp /= 10;
                counter++;
            }
            while (originalNumber != 0) {
                remainder = originalNumber % 10;
                result += Math.pow(remainder, counter);
                originalNumber /= 10;
            }
            if (result == number) {
                System.out.println(number + " jest liczbą Armstronga.");
            } else {
                System.out.println(number + " nie jest liczbą Armstronga.");
            }
            number = 0;
            counter = 0;
        }
    }
}