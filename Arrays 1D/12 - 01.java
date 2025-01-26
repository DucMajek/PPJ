public class Main {
    public static void main(String[] args) {
        int[] tab = new int[]{1, 2, 3, 4, 4, 3, 2, 1};
        for (int i = 0, j = tab.length - 1; i < tab.length / 2; i++, j--) {
            System.out.println(tab[i] == tab[j]);
        }
    }
}