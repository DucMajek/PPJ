public class Main {
    public static void main(String[] args) {
       int []x = {3,2,5,7,5};
       int[] y = {3,3,2,9,1};
       int minX = x[0];
       int minY = y[0];
       int maxX = x[0];
       int maxY = y[0];

        for (int i = 1; i < x.length - 1; i++) {
            if(minX > x[i]) minX = x[i];
            if(minY > y[i]) minY = y[i];
            if(maxX < x[i]) maxX = x[i];
            if(maxY < y[i]) maxY = y[i];
        }
        int width = maxX - minX;
        int height = maxY - minY;
        System.out.println("Szerokosc: " + width);
        System.out.println("Wysokosc: " + height);

        double centerX = ((minX + maxX) / 2.0) + minX;
        double centerY = ((minY + maxY) / 2.0) + minY;
        System.out.println("("+centerX + ", " + centerY + ")");
    }
}