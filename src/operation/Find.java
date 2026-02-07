package operation;

import book.Book;
import book.BookList;

public class Find implements Operation{
    @Override
    public void work(BookList bookList) {

        System.out.println("请输入你要查找的书名");
        Book book = bookList.findBook();

        if (book != null) {

            System.out.println(book);

        } else {

            System.out.println("未找到该书");
        }
    }
}
