package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class Find implements Operation{
    @Override
    public void work(BookList bookList) {

        System.out.println("请输入你要查找的书名");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if( bookList.find(name) ){
            System.out.println("该书已入库");
        }else{
            System.out.println("该书未入库");
        }
    }
}
