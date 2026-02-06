package book;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

    //凭借书名访问书籍
    public Book getBook(String name){
        return books.get(name);
    }
    //删除书籍
    public void dealBook(String name){
        books.remove(name);
    }
    //查找书籍
    public boolean find(String name){
        return books.containsKey(name);
    }
    //遍历书籍
    public Set<Map.Entry<String, Book>> getAllBooks() {
            return books.entrySet();
    }
}
