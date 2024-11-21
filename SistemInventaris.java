import java.util.Scanner;

public class SistemInventaris {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//.................... deklarasi ......................//

        boolean kondisi = true;
        int jenisBrng, lokasiPnym;

        System.out.println("========== Stok-Barang ==========\n");
        System.out.print("Masukkan jumlah jenis barang: ");
        jenisBrng = sc.nextInt();
        System.out.print("Masukkan jumlah lokasi penyimpanan: ");
        lokasiPnym = sc.nextInt();
        sc.nextLine();

        int penyimpananBrng [][]= new int[jenisBrng][lokasiPnym];
        String kota [] = new String[lokasiPnym];
        int stok [] = new int[jenisBrng];

        System.out.println();

//................ perulangan-Input .......................//

        System.out.println("Masukkan nama kota untuk setiap lokasi: ");
        for(int i = 0; i < penyimpananBrng[0].length; i++){
            System.out.print("Kota untuk lokasi " + (i+1) + ": ");
            kota[i] = sc.nextLine();

        }

        System.out.println();
        System.out.println("==== isi-stok-barang ====\n");

        while (kondisi) {
            System.out.printf("Jenis barang (0-%s): ",jenisBrng -1);
            int barang = sc.nextInt();
            System.out.printf("Masukkan lokasi (0-%s): ",lokasiPnym -1);
            int lokasi = sc.nextInt();
            System.out.print("Jumlah stok: ");
            penyimpananBrng [barang][lokasi] = sc.nextInt();

            System.out.print("Lanjut isi (y/n): ");
            char lanjut= sc.next().charAt(0);
            switch (lanjut) {
                case 'y':
                    kondisi = true;
                    break;
                case 'n':
                    kondisi = false;
                    break;
                default:
                    System.out.println("Masyaallah salah ketik");
                    break;
            }
            System.out.println();
        }

//.....................perulangan-Stok........................//

        System.out.println("===== Tabel-StoK-Gudang =====\n");
        
        for(String tabel : kota){
            System.out.print("\t\s" + tabel);
        }

        System.out.println();

        for(int i = 0; i < penyimpananBrng.length; i++){
            System.out.printf("Barang %s: ",i+1);
            for(int j = 0; j < penyimpananBrng[0].length; j++){
                System.out.print(penyimpananBrng[i][j] + "\t\t");
                stok[i] += penyimpananBrng[i][j];
            }
            System.out.println();
        }

//..................perulangan-total........................//

        System.out.println();
        System.out.println("====================================");
        System.out.println("Total stok untuk setiap jenis barang");
        System.out.println("====================================\n");

        for(int i = 0; i < penyimpananBrng.length; i++){
                System.out.printf("Jenis barang ke-%s : %s\n",i + 1,stok[i]);
        }

//......................perulangan-terbesar..................//

        System.out.println();
        System.out.println("====================================");
        System.out.println("=== Lokasi dengan stok terbanyak ===");
        System.out.println("====================================\n");

        for(int i = 0; i < jenisBrng; i++){
            int max = 0;
            int index = -1;
            for(int j = 0; j < lokasiPnym; j++){
                if (penyimpananBrng[i][j] > max) {
                    max = penyimpananBrng[i][j];
                    index = j;
                }
            }

            if (index != -1) {
                System.out.printf("Jenis barang ke-%s : %s\n",i+1,kota[index]);
            }else{
                System.out.printf("Jenis barang ke-%s : tidak ada", i+1);
            }
        }
    }
}