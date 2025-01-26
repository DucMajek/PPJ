public class Library {
    private Book[] books;
    private static int count = 0;

    public Library() {
        this.books = new Book[20];
    }

    void addBook(Book book) {
        if (Library.count < this.books.length) {
            this.books[Library.count++] = book;
        } else {
            System.out.println("No space for new book");
        }
    }

    public void displayLibrary() {
        for (int i = 0; books[i] != null; i++) {
            books[i].displayDetails();
            System.out.println();
        }
    }
}
