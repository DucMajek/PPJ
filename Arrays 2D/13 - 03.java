public class Main {
    public static void main(String[] args) {
        int[] data1 = {1,2,3};
        int[] data2 = {1,2,3,4};
        int[] data3 = {1,2,3,4,5};


        int[][] arr = {data1,data2,data3};

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}