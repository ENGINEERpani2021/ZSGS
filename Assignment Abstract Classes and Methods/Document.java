package pack;

abstract class Document {
    private String title;
    private String content = "";
    public Document(String title) {
        this.title = title;
    }
    public void read(){
        System.out.println(this.getContent());
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String save(String content){
        this.setContent(content);
        return "File saved successfully!!!";
    }
    abstract void open();
    abstract void edit(String string);
    abstract void close();
}
class PDFDocument extends Document{

    public PDFDocument(String title) {
        super(title);
    }
    @Override
    void open() {
        System.out.println("Opening PDF Document...\nReading contents inside ...");
        this.read();
    }
    @Override public void edit(String string) {
        System.out.println("PDF Document can't be edited!!!");
    }
    @Override
    void close() {
        System.out.println("Closing PDF Document... ");
    }
}
class TextDocument extends Document{
    public TextDocument(String title) {
        super(title);
    }
    @Override
    void open() {
        System.out.println("Opening Text Document...\nReading contents inside ...");
        this.read();
    }
    @Override public void edit(String string) {
        this.save(string);
        System.out.println("Text Document edited successfully!!!");
    }
    @Override
    void close() {
        System.out.println("Closing Text Document... ");
    }
}
class ImageDocument extends Document{
    public ImageDocument(String title) {
        super(title);
    }
    @Override
    void open() {
        System.out.println("Opening Image Document...\nReading the binary contents inside ...");
        this.read();
    }
    @Override public void edit(String string) {
        this.save(string);
        System.out.println("Image Document edited successfully!!!");
    }
    @Override
    void close() {
        System.out.println("Closing Image Document... ");
    }
}