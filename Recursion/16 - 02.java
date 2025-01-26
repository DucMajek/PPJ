//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[8][8];

        fill(arr, 0);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void fill(int[][] arr, int level) {

        if(level < arr.length/2) {
            for (int i = level ; i < arr.length - level; i++) {
                for (int j = level ; j < arr[i].length - level; j++) {
                    arr[i][j] = level + 1;
                }
            }
            fill(arr, level + 1);
        }

    }
}