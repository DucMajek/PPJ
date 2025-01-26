public class Main {
    public static void main(String[] args) {
       /* int[] tab = new int[]{1, 2, 3, 4, 4, 3, 2, 1};
        for (int i = 0, j = tab.length - 1; i < tab.length / 2; i++, j--) {
            System.out.println(tab[i] == tab[j]);
        }*/
        boolean[] tab = new boolean[]{true,true,false,false,true,true};
        boolean[] tabTrue;
        boolean[] tabFalse;
        int trueCount = 0;
        int falseCount = 0;
        for (int i = 0; i < tab.length ; i++) {
            if(tab[i])
                trueCount++;
            else
                falseCount++;
        }
        tabTrue = new boolean[trueCount];
        tabFalse  = new boolean[falseCount];
        int trueIndex = 0;
        int falseIndex = 0;
        for (boolean value : tab) {
            if (value) {
                tabTrue[trueIndex++] = true;
            } else {
                tabFalse[falseIndex++] = false;
            }
        }

        System.out.println("Oryginalna tablica:");
        for (boolean value : tab) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("Tablica true:");
        for (boolean value : tabTrue) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("Tablica false:");
        for (boolean value : tabFalse) {
            System.out.print(value + " ");
        }
    }
}