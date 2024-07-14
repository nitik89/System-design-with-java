package iteratorPattern;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books=new Arrays.asList(
            new Book(100, "Science"),
            new Book(200,"Maths"),
            new Book(500,"English")
        );
        Library lib=new Library(books);
        Iterator iterator=lib.createIterator();
        while(iterator.hasNext()){
            Book book=(Book) iterator.next();
            System.out.println(book.getBookName());
        }
    }   
}
