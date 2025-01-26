import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] tab = new char[5];

        for(int i = 0; i < tab.length; i++){
            tab[i] = (char)('A' + Math.random() * ('Z' - 'A'));
            System.out.print(tab[i] + " ");
        }
        char c = scan.next().charAt(0);
        int count = 0;

        for(int i = 0; i < tab.length; i++){
            if(c == tab[i]){
                count++;
                tab[i] = '0';
            }
        }
        System.out.println("Znak '" + c + "' wystapil " + count );

        for(int i = 0; i < tab.length; i++){
            System.out.print(tab[i] + " ");
        }

    }
}