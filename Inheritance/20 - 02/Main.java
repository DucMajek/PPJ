public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Book book = new Book("Dziady", "Adam Mickiewicz");
        Book book2 = new Book("Book", "God");
        EBook eBook = new EBook("Ebook", "ebook", "PDF");
        EBook eBook2 = new EBook("Ebook2", "ebook2", "EPUB");
        AudioBook audioBook = new AudioBook("Audiobook","Audiobook",23.3,"Tom Cruz");

        lib.addBook(book);
        lib.addBook(book2);
        lib.addBook(eBook);
        lib.addBook(eBook2);
        lib.addBook(audioBook);

        lib.displayLibrary();
    }
}