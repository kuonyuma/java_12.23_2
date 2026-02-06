package book;


import java.util.Objects;

//图书管理系统一定得有书
public class Book {
    private String name;//书名
    private String author;
    private String type;
    private int price;//价格
    private boolean isBorrow;

    public Book(String name,String author,String type,int price){
        this.name = name;
        this.author = author;
        this.type = type;
        this.price = price;
        //初始值为fals不用初始化
    }
    public Book() {

    }

    public String getName() {
        return name;
    }

    public void setIsBorrow(boolean  buf) {
         this.isBorrow = buf;
    }

    public boolean isBorrow() {
        return isBorrow;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", isBorrow=" + (!isBorrow ? "在库" : "借出") +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return price == book.price && isBorrow == book.isBorrow && Objects.equals(name, book.name) && Objects.equals(author, book.author) && Objects.equals(type, book.type);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, author, type, price, isBorrow);
    }
}
