package javaEx02;

public class Product {

    private String num;
    private String name;
    private int price;
    private String marker;
    private String date;
    private int stock;

    public Product(String num, String name, int price, String marker, String date, int stock) {
        super();
        this.num = num;
        this.name = name;
        this.price = price;
        this.marker = marker;
        this.date = date;
        this.stock = stock;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "상품번호 : " + num
                + "\n상품명 : " + name
                + "\n가격 : " + price
                + "\n제조회사 : " + marker
                + "\n제조일 : " + date
                + "\n재고 : " + stock;
    }
}

