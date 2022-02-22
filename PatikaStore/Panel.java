import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Panel {
    Scanner input = new Scanner(System.in);
    ArrayList<Notebook> notebookList = new ArrayList<>();// Set kullanimi denenecek, Treeset might be!
    ArrayList<MobilePhone> phoneList = new ArrayList<>();// bunu da kontrol et


    public void notebookPanel() {

        boolean isExit1 = false;
        while (!isExit1) {
            System.out.println("""
                                        
                    Notebook İşlemleri!
                                        
                    1 - Notebook Listele
                    2 - Notebook Ekle
                    3 - Id ile Notebook Listele
                    4 - Marka ile Notebook Listele
                    5 - Id ile Notebook Sil
                    0 - Çıkış
                    """);
            System.out.print("Tercihiniz : ");
            int select1 = input.nextInt();

            if (select1 == 0) {
                isExit1 = true;
            } else if (select1 == 1) {
                orderNotebook();
            } else if (select1 == 2) {
                System.out.print("Id: ");
                int addId = input.nextInt();
                System.out.print("Fiyat: ");
                double addPrice = input.nextDouble();
                System.out.print("İndirim Oranı: ");
                int addDiscount = input.nextInt();
                System.out.print("Stok Miktarı: ");
                int addStock = input.nextInt();
                System.out.print("Ad: ");
                String addName = input.next();
                System.out.print("Marka: ");
                String addBrandInfo = input.next();
                System.out.print("RAM: ");
                int addRam = input.nextInt();
                System.out.print("Ekran Boyutu: ");
                double addInch = input.nextDouble();
                System.out.print("Depolama: ");
                int addMemory = input.nextInt();
                System.out.print("Kategori: ");
                String addProductType = input.next();

                addNotebook(new Notebook(addId, addPrice, addDiscount, addStock, addName, addBrandInfo, addRam, addInch, addMemory, addProductType));
                printNotebookList(notebookList);
            } else if (select1 == 3) {
                System.out.println("Id giriniz: ");
                int id = input.nextInt();
                orderByIdNotebook(id);
            } else if (select1 == 4) {
                System.out.println("Marka giriniz: ");
                String brand = input.next();
                orderByBrandNotebook(brand);
            } else if (select1 == 5) {
                System.out.println("Id giriniz: ");
                int id = input.nextInt();
                deleteByIdNotebook(id);
            }
        }
    }

    public void mobilePhonePanel() {
        boolean isExit2 = false;
        while (!isExit2) {
            System.out.println("""
                                        
                    Telefon İşlemleri!
                                        
                    1 - Telefon Listele
                    2 - Telefon Ekle
                    3 - Id ile Telefon Listele
                    4 - Marka ile Telefon Listele
                    5 - Id ile Telefon Sil
                    0 - Çıkış
                    """);

            System.out.print("Tercihiniz: ");
            int select2 = input.nextInt();

            if (select2 == 0) {
                isExit2 = true;
            } else if (select2 == 1) {
                orderMobilePhone();
            } else if (select2 == 2) {
                System.out.println("Id: ");
                int id = input.nextInt();
                System.out.println("Fiyat: ");
                double price = input.nextDouble();
                System.out.println("İndirim Oranı:");
                int discount = input.nextInt();
                System.out.println("Stok Miktarı: ");
                int stock = input.nextInt();
                System.out.println("Ad: ");
                String productName = input.next();
                System.out.println("Marka: ");
                String brandInfo = input.next();
                System.out.println("Ram: ");
                int ram = input.nextInt();
                System.out.println("Ekran Boyutu: ");
                double inch = input.nextDouble();
                System.out.println("Depolama: ");
                int memory = input.nextInt();
                System.out.println("Kategori: ");
                String productType = input.next();
                System.out.println("Batarya: ");
                int battery = input.nextInt();
                System.out.println("Renk: ");
                String colour = input.next();
                System.out.println("Kamera: ");
                int camera = input.nextInt();
                addMobilePhone(new MobilePhone(id, price, discount, stock, productName, brandInfo, ram, inch, memory, productType, battery, colour, camera));
                printMobilePhoneList(phoneList);
            } else if (select2 == 3) {
                System.out.println("Id giriniz: ");
                int id = input.nextInt();
                orderByIdMobilePhone(id);
            } else if (select2 == 4) {
                System.out.println("Marka giriniz: ");
                String brand = input.next();
                orderByBrandMobilePhone(brand);
            } else if (select2 == 5) {
                System.out.println("Id giriniz: ");
                int id = input.nextInt();
                deleteByIdMobilePhone(id);
            }
        }
    }

    public void orderNotebook() {
        Notebook nHuawei = new Notebook(1, 7000.0, 0, 11,
                "HUAWEI Matebook 14", "Huawei", 16, 14.0, 512, "Notebook");
        Notebook nLenovo = new Notebook(2, 3699.0, 10, 13,
                "LENOVO V14 IGL", "Lenovo", 8, 14.0, 1024, "Notebook");
        Notebook nAsus = new Notebook(3, 8199.0, 20, 30,
                "ASUS Tuf Gaming", "Asus", 32, 15.6, 2048, "Notebook");

        notebookList.add(nHuawei);
        notebookList.add(nLenovo);
        notebookList.add(nAsus);

        printNotebookList(notebookList);
    }

    public void orderMobilePhone() {
        MobilePhone mpSamsung = new MobilePhone(1, 3199.0, 0, 6,
                "SAMSUNG GALAXY A51", "Samsung", 6, 6.5, 128, "Mobile Phone",
                4000, "Black", 32);
        MobilePhone mpApple = new MobilePhone(2, 7379.0, 10, 15,
                "iPhone 11 64 GB", "Apple", 6, 6.1, 64, "Mobile Phone", 3046,
                "Blue", 5);
        MobilePhone mpXiaomi = new MobilePhone(3, 4012.0, 20, 22,
                "Redmi Note 10 Pro 8GB", "Xiaomi", 6, 6.5, 128, "Mobile Phone",
                4000, "White", 35);

        phoneList.add(mpSamsung);
        phoneList.add(mpApple);
        phoneList.add(mpXiaomi);
        printMobilePhoneList(phoneList);
    }

    public void printMobilePhoneList(ArrayList<MobilePhone> mobilePhoneList) {
        String leftAlignFormat = "| %-2d | %-20s | %-11s | %-9s | %-10d | %-9s | %-9s | %-9s |%n";
        String headers = "| %-2s | %-20s | %-11s | %-9s | %-10s | %-9s | %-9s | %-9s |%n";
        System.out.println("--------------------------------------------------------------------------------------------\n");
        System.out.format(headers, "ID", "Ürün Adı", "Fiyat", "Marka ", "Depolama", "Ekran", "Kamera", "RAM");
        System.out.println("--------------------------------------------------------------------------------------------\n");

        for (MobilePhone product : mobilePhoneList) {
            System.out.format(leftAlignFormat, product.getId(),
                    product.getProductName(), product.getPrice(),
                    product.getBrandInfo(), product.getMemory(),
                    product.getCamera(), product.getInch(),
                    product.getRam());

        }
    }

    public void printNotebookList(ArrayList<Notebook> notebookList) {
        String leftAlignFormat = "| %-2d | %-20s | %-11s | %-9s | %-10d | %-9s | %-9s |%n";
        String headers = "| %-2s | %-20s | %-11s | %-9s | %-10s | %-9s | %-9s |%n";
        System.out.println("--------------------------------------------------------------------------------------------\n");
        System.out.format(headers, "ID", "Ürün Adı", "Fiyat", "Marka ", "Depolama", "Ekran", "RAM");
        System.out.println("--------------------------------------------------------------------------------------------\n");

        for (Notebook product : notebookList) {
            System.out.format(leftAlignFormat, product.getId(),
                    product.getProductName(), product.getPrice(),
                    product.getBrandInfo(), product.getMemory(),
                    product.getInch(), product.getRam());

        }
    }

    public void addMobilePhone(MobilePhone y) {
        this.phoneList.add(y);
    }

    public void orderByIdMobilePhone(int id) {
        String leftAlignFormat = "| %-2d | %-20s | %-11s | %-9s | %-10d | %-9s | %-9s | %-9s |%n";
        String headers = "| %-2s | %-20s | %-11s | %-9s | %-10s | %-9s | %-9s | %-9s |%n";
        System.out.println("--------------------------------------------------------------------------------------------\n");
        System.out.format(headers, "ID", "Ürün Adı", "Fiyat", "Marka ", "Depolama", "Ekran", "Kamera", "RAM");
        System.out.println("--------------------------------------------------------------------------------------------\n");

        for (MobilePhone product : phoneList) {
            if (product.getId() == id) {
                System.out.format(leftAlignFormat, product.getId(),
                        product.getProductName(), product.getPrice(),
                        product.getBrandInfo(), product.getMemory(),
                        product.getCamera(), product.getInch(),
                        product.getRam());
            }
        }
    }

    public void orderByBrandMobilePhone(String brand) {
        String leftAlignFormat = "| %-2d | %-20s | %-11s | %-9s | %-10d | %-9s | %-9s | %-9s |%n";
        String headers = "| %-2s | %-20s | %-11s | %-9s | %-10s | %-9s | %-9s | %-9s |%n";
        System.out.println("--------------------------------------------------------------------------------------------\n");
        System.out.format(headers, "ID", "Ürün Adı", "Fiyat", "Marka ", "Depolama", "Ekran", "Kamera", "RAM");
        System.out.println("--------------------------------------------------------------------------------------------\n");

        for (MobilePhone product : phoneList) {
            if (product.getBrandInfo().equals(brand)) {
                System.out.format(leftAlignFormat, product.getId(),
                        product.getProductName(), product.getPrice(),
                        product.getBrandInfo(), product.getMemory(),
                        product.getCamera(), product.getInch(),
                        product.getRam());
            }
        }
    }

    public void deleteByIdMobilePhone(int id) {
        Iterator<MobilePhone> itr = phoneList.iterator();
        while (itr.hasNext()) {
            MobilePhone product = itr.next();
            if (product.getId() == id) {
                itr.remove();
                break;
            }
        }
        printMobilePhoneList(phoneList);
    }

    public void addNotebook(Notebook x) {
        this.notebookList.add(x);
    }

    public void orderByIdNotebook(int id) {
        String leftAlignFormat = "| %-2d | %-20s | %-11s | %-9s | %-10d | %-9s | %-9s |%n";
        String headers = "| %-2s | %-20s | %-11s | %-9s | %-10s | %-9s | %-9s |%n";
        System.out.println("--------------------------------------------------------------------------------------------\n");
        System.out.format(headers, "ID", "Ürün Adı", "Fiyat", "Marka ", "Depolama", "Ekran", "RAM");
        System.out.println("--------------------------------------------------------------------------------------------\n");

        for (Notebook notebook : notebookList) {
            if (notebook.getId() == id)
                System.out.format(leftAlignFormat, notebook.getId(),
                        notebook.getProductName(), notebook.getPrice(),
                        notebook.getBrandInfo(), notebook.getMemory(),
                        notebook.getInch(), notebook.getRam());
        }
    }

    public void orderByBrandNotebook(String brand) {
        String leftAlignFormat = "| %-2d | %-20s | %-11s | %-9s | %-10d | %-9s | %-9s |%n";
        String headers = "| %-2s | %-20s | %-11s | %-9s | %-10s | %-9s | %-9s |%n";
        System.out.println("--------------------------------------------------------------------------------------------\n");
        System.out.format(headers, "ID", "Ürün Adı", "Fiyat", "Marka ", "Depolama", "Ekran", "RAM");
        System.out.println("--------------------------------------------------------------------------------------------\n");

        for (Notebook notebook : notebookList) {
            if (notebook.getBrandInfo().equals(brand))
                System.out.format(leftAlignFormat, notebook.getId(),
                        notebook.getProductName(), notebook.getPrice(),
                        notebook.getBrandInfo(), notebook.getMemory(),
                        notebook.getInch(), notebook.getRam());
        }
    }

    public void deleteByIdNotebook(int id) {

        Iterator<Notebook> itr = notebookList.iterator();
        while (itr.hasNext()) {
            Notebook input = itr.next();
            if (input.getId() == id) {
                itr.remove();
                break;
            }
        }
        printNotebookList(notebookList);

    }

}
