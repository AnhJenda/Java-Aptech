package codeleanComposition;

public class BookEx1 {
    private String name;
    private AuthorEx1 author;
    private double price;
    private int qty;

    public BookEx1(String name, AuthorEx1 author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }
    public AuthorEx1 getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public int getQty() {
        return qty;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        return "'" + name + "' by" + author;
    }
}
