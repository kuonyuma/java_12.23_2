package operation;

import book.BooList;

public class Find implements Operation{
    @Override
    public void work(BooList booList) {
        System.out.println("书名查找");
    }
}
