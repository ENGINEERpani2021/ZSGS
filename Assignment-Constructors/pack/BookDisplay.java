package pack;

import java.util.ArrayList;
import java.util.List;

public class BookDisplay {
    public static List<Book> bookList;
    public BookDisplay(){
        this.bookList=new ArrayList<>();
    }
    public void displayBooks(){
        for(Book b: bookList){
            System.out.println(b.getTitle()+"   "+b.getAuthor()+"   "+b.getIsbn()+"   "+b.getLanguage()+"   "+b.getGenre()+"   Rs."+b.getPrice());
        }
    }
    public static void main(String[] args) {
        BookDisplay bookDisplay = new BookDisplay();
        Book book = new Book();
        book.setTitle("Clean Code");
        book.setAuthor("Robert C. Martin Series");
        book.setIsbn("9780132350884");
        book.setGenre("programming");
        book.setLanguage("English");
        book.setPrice(950);
        bookDisplay.bookList.add(book);
        bookDisplay.displayBooks();
    }
}
