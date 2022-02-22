import java.util.Scanner;

public class Store {
    private final String name;

    public Store(String name) {
        this.name = name;
    }

    Scanner input = new Scanner(System.in);

    public void run() {
        Panel panel = new Panel();
        Brand brands = new Brand();

        while (true) {
            System.out.println(this.name + " Ürün Yönetim Paneli!");
            System.out.println("""
                    1 - Notebook İşlemleri
                    2 - Cep Telefonu İşlemleri
                    3 - Marka Listele
                    0 - Çıkış Yap""");
            System.out.print("Lütfen bir işlem giriniz: ");
            int select = input.nextInt();
            if (select == 0) {
                break;
            } else if (select == 1) {
                panel.notebookPanel();
            } else if (select == 2) {
                panel.mobilePhonePanel();
            } else if (select == 3) {
                brands.printBrand();
            }
        }
    }


}
