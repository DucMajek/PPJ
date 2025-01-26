import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[] test = {' ', 'a', 'b', 'c', ' '};
        //char[] test = {' ', ' '};
        //char[] test = null;
        System.out.println(trim(test));

    }

    public static char[] trim(char[] tab) {
        if (tab.length == 0) return tab;
        int count = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == ' ') {
                count++;
            }
        }

        if (count == tab.length)
            return new char[0];


        char[] tabWithOutSpace;
        int count2 = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] != ' ') {
                count2++;
            }
        }
        tabWithOutSpace = new char[count2];

        for (int i = 0, j = 0; i < tab.length; i++) {
            if (tab[i] != ' ') {
                tabWithOutSpace[j++] = tab[i];
            }
        }
        return tabWithOutSpace;

    }
}