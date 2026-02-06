package operation;

import book.BookList;

import java.util.Scanner;

public class Return implements Operation{
    @Override
    public void work(BookList bookList) {

        //先输入书名
        System.out.println("请输入你要借出的书名");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if(!bookList.find(name)){
            System.out.println("没有这本书");
            return;
        }

        bookList.getBook(name).setIsBorrow(false);
    }
}
