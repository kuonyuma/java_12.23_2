package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class Borrow implements Operation{
    @Override
    public void work(BookList bookList) {

        System.out.println("请输入你要借出的书名");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if(!bookList.find(name)){
            System.out.println("没有这本书");
            return;
        }
        if(bookList.getBook(name).isBorrow()){
            System.out.println("该书已经借出");
            return;
        }
        bookList.getBook(name).setIsBorrow(true);
        System.out.println("成功借到书籍");
    }
}
