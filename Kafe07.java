import java.util.Scanner;

public class Kafe07 {
    static Scanner sc = new Scanner(System.in);
    static String namaPelanggan, kodePromo;
    static boolean isMember;


    // public static void menu() {
    //     System.out.println("===== MENU RESTO KAFE =====");
    //     System.out.println("1. Kopi Hitam - Rp 15,000");
    //     System.out.println("2. Cappuccino - Rp 20,000");
    //     System.out.println("3. Latte - Rp 22,000");
    //     System.out.println("4. Teh Tarik - Rp 12,000");
    //     System.out.println("5. Roti Bakar - Rp 10,000");
    //     System.out.println("6. Mie Goreng - Rp 18,000");
    //     System.out.println("===========================");
    //     System.out.println("Silahkan pilih menu yang anda inginkan.");
    // }

    public static void menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
            System.out.println();
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("============== Kode promo valid ===============");
            System.out.println("= Selamat anda mendapatkan diskon sebesar 50% =");
            System.out.println();
        }else if (kodePromo.equals("DISKON30")) {
            System.out.println("============== Kode promo valid ===============");
            System.out.println("= Selamat anda mendapatkan diskon sebesar 30% =");
            System.out.println();
        } else {
            System.out.println("=========== kode promo tidak valid ============");
            System.out.println();
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

    public static int hitungTotalHarga(int[] pilihanMenu, int[] banyakItem, String kodePromo) {
         int [] hargaItem= {15000, 20000, 22000, 12000, 10000, 18000};
         int hargaTotal = 0;

         for(int i = 0; i < pilihanMenu.length; i++){
            hargaTotal += hargaItem[pilihanMenu[i] - 1] * banyakItem[i];
         }

         if (kodePromo.equals("DISKON50")) {
            hargaTotal *= 0.5;
            System.out.println("Potongan diskon 50%");
         } else if (kodePromo.equals("DISKON30")) {
            hargaTotal *= 0.7;
            System.out.println("Potongan diskon 30%");
         } else if (!kodePromo.isEmpty()) {
            System.out.println("===== Kode promo tidak valid =====");
         }
         return hargaTotal;
    }

    public static void main(String[] args) {
        

        System.out.println("==== SELAMAT DATANG DI KAFE JTI ====");
        System.out.println();
        System.out.print("Masukkan nama anda: ");
        namaPelanggan = sc.nextLine();
        System.out.print("Apakah anda member (true/false): ");
        isMember = sc.nextBoolean();
        sc.nextLine();
        System.out.print("Masukkan kode promo anda: ");
        kodePromo = sc.nextLine();
        System.out.println();

        menu(namaPelanggan, isMember, kodePromo);

        System.out.print("Masukkan jumlah menu yang ingin dipesan: ");
        int jmlMenu = sc.nextInt();

        int []pilihanMenu = new int[jmlMenu];
        int []banyakItem = new int[jmlMenu];

        System.out.println();

        for(int i = 0; i < jmlMenu; i++){
            System.out.printf("Masukkan menu ke-%s : ",i+1);
            pilihanMenu[i] = sc.nextInt();
            System.out.printf("Masukkan jumlah menu ke-%s : ",i+1);
            banyakItem[i] = sc.nextInt();
        }

        System.out.println();
        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
        System.out.println("Total pesanan anda adalah: Rp " + totalHarga);


    }

    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        for(String pengunjung : namaPengunjung){
            System.out.println("- " + namaPengunjung);
        }
    }
}
