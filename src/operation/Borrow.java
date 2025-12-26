package operation;

import book.BooList;

import java.util.Scanner;

public class Borrow implements Operation{
    @Override
    public void work(BooList booList) {
        //System.out.println("借阅图书");
        //将isBorrow修改为true
        //选择要借出的书籍
        int cureSize = booList.getBoosSize();
        int pos = -1;
        //先输入书名查找到书的下标
        System.out.println("请输入你要借出的书名");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        //返回下标,查找函数
        //如何查找?
        for (int i = 0; i < cureSize; i++) {
            if(booList.getBooks(i).getName().equals(name)){//booList.getBooks(i).getName().equals(name)这个语句的逻辑是什么
                pos = i;
                break;
            }
        }
        if(pos == -1){
            System.out.println("未找到该书籍");
            return;
        }
        if(booList.getBooks(pos).isBorrow() == true){
            System.out.println("该书已经借出");
            return;
        }
        booList.getBooks(pos).setIsBorrow(true);


    }
}
