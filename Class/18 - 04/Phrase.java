public class Phrase {
    private int size;
    private String[] words;
    public Phrase(){
        this.words = new String[2];
        this.size = 0;
    }
    public void addWordAtEnd(String word) {
        if (size == words.length) {
            increaseArraySize();
        }
        words[size] = word;
        size++;
    }

    private void increaseArraySize() {
        String[] newWords = new String[words.length * 2];
        for (int i = 0; i < words.length; i++) {
            newWords[i] = words[i];
        }
        words = newWords;
    }
    public void show(){
        for (int i = 0; i < size; i++) {
            System.out.print(words[i] + " ");
        }
        System.out.println();
    }
}
