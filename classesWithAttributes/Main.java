public class Main {
    public static void main(String[] args) {
        Product laptop = new Product(
                12738, "Laptop - ASSUS", "Asus", 3000
        );

        ProductManager productManager =  new ProductManager();
        productManager.add(laptop);
        System.out.println(laptop.getKod());
    }
}