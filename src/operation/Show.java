package operation;

import book.BooList;

public class Show implements Operation{
    @Override
    public void work(BooList booList) {
       //遍历books打印出来
        for (int i = 0; i < booList.getBoosSize(); i++) {
            System.out.println(booList.getBooks(i));
            //当你在自定义类中使用println时只要你的类不是空的，那么就是用object里面的默认toString。
            //
            //默认的toString,只会输出这个引用的哈希码
            //
            //当你在你自己定义的类中重写了toString后。由于继承关系。优先调动，子类重写的方法。
            //不会调用父类的方法
        }
    }
}
