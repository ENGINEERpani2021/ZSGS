package pack;

public class DocumentDemo {
    public static void main(String[] args) {
        Document pdf = new PDFDocument("ABC");
        Document text = new TextDocument("Meeting Notes");
        Document image = new ImageDocument("Vacation Photo");
        pdf.save("ABC");text.save("Java");image.save("11111");
        pdf.open();pdf.edit("Changing content");pdf.open();pdf.close();
        text.open();text.edit("Changing content");pdf.open();text.close();
        image.open();text.edit("00000");pdf.open();image.close();
    }
}
