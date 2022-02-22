public abstract class Product {
    private int id;
    private double price;
    private int discount;
    private int stock;
    private String productName;
    private String brandInfo;
    private int ram;
    private double inch;
    private int memory;
    private String productType;

    public Product(int id, double price, int discount, int stock, String productName, String brandInfo, int ram, double inch, int memory, String productType) {
        this.id = id;
        this.price = price;
        this.discount = discount;
        this.stock = stock;
        this.productName = productName;
        this.brandInfo = brandInfo;
        this.ram = ram;
        this.inch = inch;
        this.memory = memory;
        this.productType = productType;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    public String getBrandInfo() {
        return brandInfo;
    }

    public int getRam() {
        return ram;
    }

    public double getInch() {
        return inch;
    }

    public int getMemory() {
        return memory;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }
}
