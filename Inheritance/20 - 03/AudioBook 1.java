public class AudioBook  {
    private Book book;
    private double duration;
    private final String narrator;

    public AudioBook(String title, String author, double duration, String narrator) {
        this.book = new Book(title, author);
        this.duration = duration;
        this.narrator = narrator;
    }

    public void play() {
        System.out.println("Playing audio book narrated by " + narrator);
    }

    public void displayDetails(){
        book.displayDetails();
        System.out.println(" Duration: " + duration);
        System.out.println(" Narrator: " + narrator);
    }

    public AudioBook clone(){
        return new AudioBook(this.book.getTitle(), this.book.getAuthor(), this.duration, this.narrator);
    }
}
