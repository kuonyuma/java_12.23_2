package book;

//有书一定有书架
public class BooList {
    //书架用数组维护吧，顺序表
    //关于为什么要加final，在后续操作中books这个引用没有被修改
    private final Book[] books = new Book[10];
    //当前书架的书本数量
    private int boosSize;
    //构造函数,塞进去几本书方便后续测试
    public BooList(){
        //卡住了如何初始化几本书？
         this.books[0] = new Book
                 ("千恋万花","柚子社","教育",45);
         this.books[1] = new Book
                 ("三国演义","罗贯中","历史",19);
         this.books[2] = new Book
                 ("石头记","曹雪芹","小说",39);
         this.boosSize = 3;
         //回答:
        //这里的books[0]只是引用类型，还没有实例化。
    }

    //更新书本数量
    public void setBoosSize(int boosSize) {
        this.boosSize = boosSize;
    }
    //得到书本数量，也是数组的下标
    public int getBoosSize(){
        return boosSize;
    }

    //增加新的图书
    public void setBooks(int boosSize,Book book) {
       this.books[boosSize] = book;
    }

    //公开接口使得使调用者可以凭借下标访问书
    public Book getBooks(int pos){
        return this.books[pos];
    }

}
