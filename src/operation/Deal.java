package operation;

import book.BookList;

import java.awt.*;
import java.util.Scanner;

public class Deal implements Operation {
    @Override
    public void work(BookList bookList) {


        System.out.println("请输入你要删除的书名");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        bookList.dealBook(name);

    }

}
