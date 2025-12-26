package operation;

import book.BooList;

import java.util.Scanner;

public class Return implements Operation{
    @Override
    public void work(BooList booList) {

        int cureSize = booList.getBoosSize();
        int pos = -1;
        //先输入书名查找到书的下标
        System.out.println("请输入你要归还的书名");
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
            System.out.println("书架中还未加入该书籍");
            return;
        }
        if(booList.getBooks(pos).isBorrow() == false){
            System.out.println("该书已在库中");
            return;
        }
        booList.getBooks(pos).setIsBorrow(false);
    }
}
