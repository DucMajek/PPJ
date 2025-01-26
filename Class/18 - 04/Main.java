import java.lang.ref.PhantomReference;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Phrase p = new Phrase();
        p.addWordAtEnd("Hello");
        p.addWordAtEnd("PPJ");
        p.show();
    }
}