public class Main {
    public static void main(String[] args) {
        double[] tab = new double[10];

      /*  // wypelnienie losowymi wartościami + wyświetlanie całej zawartości
        for(int i = 0; i< tab.length; i++){
            tab[i] = Math.random() * 10;
            System.out.print(tab[i] + " ");
        }
        System.out.println("\n=======================");
        //wyswietlanie liczby o indeksie parzystym
        for(int i = 0; i< tab.length; i++){
            System.out.print(i % 2 == 0? tab[i]: " ");
        }
        System.out.println("\n=======================");

        // elementy przekonwertowane na int i wyswietlanie nieparzystych
        for(int i = 0; i< tab.length; i++){
            tab[i] = (int)tab[i];
            if(tab[i] % 2 == 0) continue;
            System.out.print(tab[i] + " | ");
        }*/
        // A - 65
        // b - 98
        // 0 - 48
        // C - 67
        // (char)('A'+Math.random()* 'Z'-'A')
        char[] c = new char[]{'A','b','C'};
        int min = c[0]; // przyjmuje na początek najmnieszy element jest na indeksie 0
        int index = 0; // do wyswietlenia, ktory indeks ma najmnieszą wartosc
        for(int i = 1; i < c.length; i++){
            if(min > c[i]){
                min = c[i];
                index = i;
            }
        }
        System.out.println(index);

    }
}