import java.util.Scanner;

public class Word {
    private char[] word;
    private int arrSize;

    public Word() {
        this.word = new char[100];
        this.arrSize = 0;
    }

    public void addChar(char character){
        if(arrSize < word.length)
            word[arrSize++] = character;
    }

    public void show(){
        for (int i = 0; i < word.length; i++) {
            System.out.print(word[i] + " ");
        }
    }

    public int length(){
        return arrSize;
    }
}
