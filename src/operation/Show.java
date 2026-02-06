package operation;
import book.Book;
import book.BookList;
import java.util.Map;

public class Show implements Operation{
    @Override
    public void work(BookList booList) {

        for(Map.Entry<String, Book> entry:booList.getAllBooks()){
            System.out.println(entry);
        }
    }
}
