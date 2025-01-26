public final class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        setTitle(title);
        setAuthor(author);
    }

    public void displayDetails() {
        System.out.println(" Title: " + this.title + "\n Author: " + this.author);
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}
