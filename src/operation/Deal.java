package operation;

import book.BooList;

import java.awt.*;
import java.util.Scanner;

public class Deal implements Operation {
    @Override
    public void work(BooList booList) {

        int cureSize = booList.getBoosSize();
        int pos = -1;
        // 先输入书名查找到书的下标
        System.out.println("请输入你要删除的书名");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        // 返回下标,查找函数
        // 如何查找?
        for (int i = 0; i < cureSize; i++) {
            if (booList.getBooks(i).getName().equals(name)) {// booList.getBooks(i).getName().equals(name)这个语句的逻辑是什么
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("未找到该书籍");
            return;
        }
        for (int j = pos; j < cureSize - 1; j++) {
            // booList.getBooks(pos) = booList.getBooks(pos+1);
            booList.setBooks(j, booList.getBooks(j + 1));
        }
        System.out.println("删除成功");
        booList.setBoosSize(cureSize - 1);

    }

}
