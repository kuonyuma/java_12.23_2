import book.BooList;
import use.AdminUser;
import use.NormalUser;
import use.User;

import java.util.Scanner;

public class Master {
    public static User login(){

        //输入姓名，权限
        System.out.print("请输入你的姓名:");
        Scanner sc =new Scanner(System.in);
        String name = sc.nextLine();

        System.out.print("请选择权限：");
        int buf = sc.nextInt();
        //挺有意思，新的写法
        return switch(buf){
            case 1 ->  new AdminUser(name);
            case 2 ->  new NormalUser(name);
            default -> null;
        };

    }
    public static void main(String[] args) {
        BooList boolist = new BooList();

        User user = login();
        while(true){

            // 通常只负责显示菜单并返回用户选择的操作编号，
            int choice = user.menu();
            // 你需要根据这个返回值去执行具体的业务逻辑。
            //调用具体的接口，作用与书架，
            user.doOperation(choice,boolist);

        }
    }
}
