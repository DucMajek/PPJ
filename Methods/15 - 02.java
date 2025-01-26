public class Main {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2},
                {1, 2, 1}};
        int[][] arr2 = {
                {1, 2},
                {1, 2, 3}};
        System.out.println(isEqual(arr, arr2));
    }

    public static boolean isEqual(int[][] arr, int[][] arr2) {
        int count1 = 0;
        int count2 = 0;
        if (arr.length == arr2.length) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    count1++;
                }
            }
            for (int i = 0; i < arr2.length; i++) {
                for (int j = 0; j < arr2[i].length; j++) {
                    count2++;
                }
            }
            if (count1 != count2)
                return false;

            for (int i = 0; i < arr2.length; i++) {
                for (int j = 0; j < arr2[i].length; j++) {
                    if (arr[i][j] != arr2[i][j]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}