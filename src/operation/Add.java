package operation;

import book.BookList;
import book.Book;
import java.awt.*;
import java.util.Scanner;

public class Add implements Operation{
    @Override
    public void work(BookList bookList) {
//        System.out.println("增加图书");

        System.out.println("请输入图书的信息");
        Scanner sc = new Scanner(System.in);
        System.out.println("书名");
        String name = sc.nextLine();
        System.out.println("作者");
        String author = sc.nextLine();
        System.out.println("类型");
        String type = sc.nextLine();
        System.out.println("价格");
        int price = sc.nextInt();

        Book book = new Book(name,author,type,price);
        bookList.addBook(book);

    }
}
