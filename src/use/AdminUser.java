package use;

import operation.*;

import java.util.Scanner;

public class AdminUser extends User{
    public AdminUser(String name){
         super(name);
    }
    public int menu(){
        System.out.println("0.退出程序");
        System.out.println("1.展示所有图书");
        System.out.println("2.增加图书");
        System.out.println("3.减少图书");
        System.out.println("4.书名查找");
        System.out.println("5.修改图书信息");

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入功能");
        //这里buf就做了接口的下标
        int buf = sc.nextInt();

        //引用需要new对象
        works[0] = new Exit();
        works[1] = new Show();
        works[2] = new Add();
        works[3] = new Deal();
        works[4] = new Find();

        return buf;
    }





}
