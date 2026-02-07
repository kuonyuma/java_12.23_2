package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class Return implements Operation{
    @Override
    public void work(BookList bookList) {

        //先输入书名
        System.out.println("请输入你要借出的书名");

        Book book = bookList.findBook();
        if(book != null){
            System.out.println("已归还");
            book.setCount(1);
        }else {
            System.out.println("这不是图书管的书");
        }
    }
}
