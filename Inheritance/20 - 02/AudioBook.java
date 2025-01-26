public class AudioBook extends Book {
    private double duration;
    private String narrator;

    public AudioBook(String title, String author, double duration, String narrator) {
        super(title, author);
        this.duration = duration;
        this.narrator = narrator;
    }

    public void play() {
        System.out.println("Playing audio book narrated by " + narrator);
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println(" Duration: " + duration);
        System.out.println(" Narrator: " + narrator);
    }
}
