import java.util.ArrayList;
import java.util.Scanner;

public class Notebook extends Product {
    public Notebook(int id, double price, int discount, int stock, String productName, String brandInfo, int ram, double inch, int memory, String productType) {
        super(id, price, discount, stock, productName, brandInfo, ram, inch, memory, productType);
    }


    @Override
    public String getProductType() {
        return "Notebook";
    }

    @Override
    public void setProductType(String productType) {
        super.setProductType(productType);
    }
}
