public class Rakieta {
    private String nazwa;
    private int wagaPaliwa;

    public Rakieta(String nazwa){
        this.nazwa = nazwa;;
    }

    public void zatankuj(){
        while(this.wagaPaliwa < 1000) {
            this.wagaPaliwa = (int) (Math.random() * 1000) + this.wagaPaliwa;
        }
    }

    public void start() throws Exception{
        if(this.wagaPaliwa < 1000)
            throw new Exception("Start anulowany - za mało paliwa");
        else {
            System.out.println("Rozpoczynam odliczanie: ");
            for (int i = 10; i > 0; i--) {
                System.out.print(i + " ");
            }
        }
    }
}
