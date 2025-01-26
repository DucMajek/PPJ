import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Word word = new Word();

        word.addChar('H');
        word.addChar('e');
        word.addChar('l');
        word.addChar('l');
        word.addChar('o');

        word.show();
        System.out.println();
        System.out.println(word.length());

    }
}