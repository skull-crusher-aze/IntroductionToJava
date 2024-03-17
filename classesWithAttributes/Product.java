public class Product {
    public Product(int id, String name, String detail, double price) {
        System.out.println("Exucuted!");
        this.id = id;
        this.name = name;
        this.detail = detail;
        this.price = price;
    }
    private int id;
     String name;
     String detail;
     double price;
    private int kod;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getPrice() {
        return price;
    }

    public String getKod() {
        return this.id + this.name.substring(0,1);
    }
}
