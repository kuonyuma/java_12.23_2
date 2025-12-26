package operation;

import book.BooList;
import book.Book;

import java.awt.*;
import java.util.Scanner;

public class Add implements Operation{
    @Override
    public void work(BooList booList) {
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


        //new一个新的book引用类型然后实例化；
        Book book = new Book(name,author,type,price);
        int size = booList.getBoosSize();
        //将书本的数量+1
        booList.setBoosSize(size+1);
        //传入书本，与书本数量
        booList.setBooks(size,book);

    }
}
