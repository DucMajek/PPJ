
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Title1", "Author1");
        DigitalBook digitalBook = new DigitalBook(new Book("Title2", "Author2"), "PDF");
        AudioBook audioBook = new AudioBook("Title3", "Author3", 10.5, "Narrator1");
        // Dodawanie książek do biblioteki
        library.addBook(book1);
        library.addBook(digitalBook);
        library.addBook(audioBook);

        // Wyświetlenie zawartości biblioteki
        library.displayLibrary();

        // Wyszukiwanie książki po tytule
        library.findBookByTitle("Title3");

    }
}