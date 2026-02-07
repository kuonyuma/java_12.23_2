import book.BookList;
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
        int id = sc.nextInt();
        return switch(id){
            case 1 ->  new AdminUser(name);
            case 2 ->  new NormalUser(name);
            default -> null;
        };

    }
    public static void main(String[] args) {
        BookList booklist = new BookList();

        User user = login();
        while(true){

            // 通常只负责显示菜单并返回用户选择的操作编号，
            int choice = user.menu();
            // 你需要根据这个返回值去执行具体的业务逻辑。
            //调用具体的接口，作用与书架，
            user.doOperation(choice,booklist);

        }
    }
    public static void main1(String[] args){
        String name = "我不想当牛马";
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();
        if(name.contains(src)){
            System.out.println("我也不想");
        }else{
            System.out.println("嗯？");
        }
    }
}
