public class MobilePhone extends Product {
    private int battery;
    private String colour;
    private int camera;

    public MobilePhone(int id, double price, int discount, int stock, String productName, String brandInfo, int ram, double inch, int memory, String productType, int battery, String colour, int camera) {
        super(id, price, discount, stock, productName, brandInfo, ram, inch, memory, productType);
        this.battery = battery;
        this.colour = colour;
        this.camera = camera;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    @Override
    public String getProductType() {
        return "Mobile Phone";
    }

    @Override
    public void setProductType(String productType) {
        super.setProductType(productType);
    }
}
