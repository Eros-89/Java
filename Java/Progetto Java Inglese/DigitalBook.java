public class DigitalBook extends Book {

    private String format;
    private double sizeMB;

    public DigitalBook(String title, String author, int year,
                       String format, double sizeMB) {
        super(title, author, year);
        this.format = format;
        this.sizeMB = sizeMB;
    }

    public String getFormat() { return format; }
    public double getSizeMB() { return sizeMB; }

    @Override
    public String toString() {
        return super.toString() + " | Format: " + format
               + " | " + sizeMB + " MB";
    }
}
