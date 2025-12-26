package operation;

import book.BooList;

public class Exit implements Operation{
    @Override
    public void work(BooList booList) {
        System.out.println("退出程序");
        System.exit(0);
    }
}
