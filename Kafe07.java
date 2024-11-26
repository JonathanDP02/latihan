import java.util.Scanner;

public class Kafe07 {
    static Scanner sc = new Scanner(System.in);

    public static void menu() {
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");
    }

    public static void menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
         int [] hargaItem= {15000, 20000, 22000, 12000, 10000, 18000};

         int hargaTotal = hargaItem[pilihanMenu-1] * banyakItem;
         return hargaTotal;
    }

    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        for(int i = 0; i < namaPengunjung.length; i++){
            System.out.println("- " + namaPengunjung[i]);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali","Budi","Citra");
    }
}
