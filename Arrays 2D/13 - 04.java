public class Main {
    public static void main(String[] args) {
        float[][] data = new float[8][8];
        float rightSum = 0;
        float leftSum = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = (float) (Math.random() * 10);
            }
        }

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if(j==i)
                    leftSum+=data[i][j];
            }
        }

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length ; j++) {
                if(j + i == data.length - 1)
                    rightSum+=data[i][j];

            }
        }

        System.out.println(rightSum);
        System.out.println(leftSum);
    }
}