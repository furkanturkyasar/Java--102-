import java.util.TreeSet;

public class Brand {
    private int id;
    private String name;

    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Brand() {

    }

    public void printBrand() {
        TreeSet<Brand> brands = new TreeSet<>(new OrderByNameComparator());
        Brand samsung = new Brand(1, "Samsung");
        Brand lenovo = new Brand(2, "Lenovo");
        Brand apple = new Brand(3, "Apple");
        Brand huawei = new Brand(4, "Huawei");
        Brand casper = new Brand(5, "Casper");
        Brand asus = new Brand(6, "Asus");
        Brand hp = new Brand(7, "HP");
        Brand xiaomi = new Brand(8, "Xiaomi");
        Brand monster = new Brand(9, "Monster");

        brands.add(samsung);
        brands.add(lenovo);
        brands.add(apple);
        brands.add(huawei);
        brands.add(casper);
        brands.add(asus);
        brands.add(hp);
        brands.add(xiaomi);
        brands.add(monster);

        System.out.println("----------Markalar----------");
        for (Brand brand : brands) {
            System.out.println("- " + brand.getName());
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
