public class DigitalBook {
    private Book book;
    private String fileFormat;

    public DigitalBook(Book book, String fileFormat) {
        this.book = book;
        this.fileFormat = fileFormat;
    }

    public Book getBook() {
        return book;
    }

    public void displayDetails() {
        System.out.println("Digital Book: ");
        book.displayDetails();
        System.out.println("File Format: " + fileFormat);
    }
}
