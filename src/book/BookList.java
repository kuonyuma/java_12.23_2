package book;

import java.util.*;

//有书一定有书架
public class BookList {

    //关于为什么要加final，在后续操作中books这个引用没有被修改
    private final Map<String,Book> books = new HashMap<>();
    //构造函数,塞进去几本书方便后续测试

    public BookList(){
        this.books.put("千恋万花", new Book("千恋万花", "柚子社", "教育", 45));
        this.books.put("三国演义", new Book("三国演义", "罗贯中", "历史", 19));
        this.books.put("西游记", new Book("西游记", "吴承恩", "小说", 29));
    }

    //得到书本数量
    public int getBoosSize(){
        return books.size();
    }

    //增加新的图书
    public void addBook(Book book){
        books.put(book.getName(),book);
    }



    //删除书籍
    public void dealBook(String name){
        books.remove(name);
    }
    //查找(精确查找与模糊查找)
    public Book findBook(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //精确搜索
        Book book = books.get(str);
        if( books.get(str) != null){
            return book;
        }
        //模糊搜索
        for(Book book1 : books.values()){
            String name = book1.getName();
            if(name != null && name.contains(str)){
                return book1;
            }
        }

        return null;
    }

    //遍历书籍
    public Set<Map.Entry<String, Book>> getAllBooks() {
            return books.entrySet();
    }
}
