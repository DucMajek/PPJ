public class Main {
    public static void main(String[] args) {
        int[][] tab = {
                {3, 4},
                {5, 6, 7},
                {8}
        };
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                sum+=tab[i][j];
            }
        }
        System.out.println(sum);
    }
}