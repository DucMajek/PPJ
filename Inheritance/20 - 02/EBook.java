public class EBook extends Book {

    private String fileFormat;

    public EBook(String title, String author, String fileFormat) {
        super(title, author);
        this.fileFormat = fileFormat;
    }

    public void open(){
        System.out.println("Opening book in format " + fileFormat);
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println(" File format: " + fileFormat);
    }
}
