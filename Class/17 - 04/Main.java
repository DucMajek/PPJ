public class Main {
    public static void main(String[] args) {
        Walec walec = new Walec(3, 5);
        Kwadrat kwadrat = new Kwadrat(4);

        KulaW kulaZWalcem = new KulaW(walec);
        KulaW kulaZKwadratem = new KulaW(kwadrat);

        kulaZWalcem.show();
        System.out.println("========================");
        kulaZKwadratem.show();

    }
}