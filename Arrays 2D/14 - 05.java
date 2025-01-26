public class Main {
    public static void main(String[] args) {
        int[][] maciez = {
                {2, 4, 1},
                {0, -3, 5},
                {7, 2, 0}
        };

        /*int[][] maciez = {
                {2, 0, 0},
                {0, -3, 0},
                {0, 0, 1}
        };*/

        int sum = 0;
        //1
        for (int i = 0; i < maciez.length; i++) {
            for (int j = 0; j < maciez[i].length; j++) {
                sum += maciez[i][j];
            }
        }

        System.out.println("Suma: " + sum);

        //2
        int row = 0;
        int column = 0;
        int maxElement = maciez[0][0];
        for (int i = 0; i < maciez.length; i++) {
            for (int j = 0; j < maciez[i].length; j++) {
                if(maciez[i][j] > maxElement) {
                    maxElement = maciez[i][j];
                    column = j;
                    row = i;
                }
            }
        }
        System.out.println("Max element: " + maxElement);
        System.out.println("Column: " + column);
        System.out.println("Row: " + row);

        boolean x = true;
        //3
        for (int i = 0; i < maciez.length; i++) {
            for (int j = 0; j < maciez[i].length; j++) {
                if(i != j && maciez[i][j] != 0) {
                    x = false;
                    break;
                }
            }
        }
        System.out.println(x ? "Maciez diagonalna":"Nie jest to maciez diagonalna");
    }
}