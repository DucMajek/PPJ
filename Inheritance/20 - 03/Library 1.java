public class Library {
    private Object[] books;
    private static int count = 0;

    public Library() {
        super();
        this.books = new Object[20];
    }

    void addBook(Object book) {
        if (Library.count < this.books.length) {
            this.books[Library.count++] = book;
        } else {
            System.out.println("No space for new book");
        }
    }

    public void displayLibrary() {
        for (int i = 0; i < count; i++) {
            if (books[i] instanceof Book) {
                ((Book) books[i]).displayDetails();
            } else if (books[i] instanceof DigitalBook) {
                DigitalBook digitalBook = (DigitalBook) books[i];
                digitalBook.displayDetails();
            }
        }
    }

    public void findBookByTitle(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i] instanceof Book) {
                Book book = (Book) books[i];
                if (book.getTitle().equals(title)) {
                    book.displayDetails();
                    return;
                }
            } else if (books[i] instanceof DigitalBook) {
                DigitalBook digitalBook = (DigitalBook) books[i];
                if (digitalBook.getBook().getTitle().equals(title)) {
                    digitalBook.displayDetails();
                    return;
                }
            }
        }
        System.out.println("Book with title '" + title + "' not found.");
    }
}
