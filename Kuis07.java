import java.util.Scanner;

public class Kuis07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};

//............................. input jumlah wilayah ..........................................//

        System.out.println("========== BPSDA ==========");
        System.out.print("Masukkan jumlah wilayah: ");
        int kota = sc.nextInt();
        sc.nextLine();
        System.out.println();

        String[] wilayah = new String[kota];
        int[][] dataKms = new int[kota][7];
        int[] konsumsi = new int[kota];

//............................ input air ....................................................//

        System.out.println("==== Masukkan Konsunsi Air Per-Wilayah ====");

        for(int i = 0; i < kota; i++){
            System.out.printf("Masukkan wilayah ke-%s : ", i+1);
            wilayah[i] = sc.nextLine();
            System.out.println();
            System.out.printf("Masukkan konsumsi air di wilayah %s\n",wilayah[i]);

            for(int j = 0; j < 7; j++){
                System.out.printf("%s : ",hari[j]);
                dataKms[i][j]=sc.nextInt();
                konsumsi[i] += dataKms[i][j];
                sc.nextLine();
            }
            System.out.println();
        }

//............................ perhitungan rata-rata perwilayah ..........................//

        double[] ksmHarian = new double[7];
        for (int i = 0; i < kota; i++) {
            for (int j = 0; j < 7; j++) {
                ksmHarian[j] += dataKms[i][j];
            }
        }
        for (int j = 0; j < 7; j++) {
            ksmHarian[j] /= kota;
        }

//......................... perhitungan wilayah dengan konsumsi tertinggi ................//
        
        int maxWilayah = 0;
        for(int i = 1; i < kota; i++){
            if (konsumsi[i] > konsumsi[maxWilayah]) {
                maxWilayah = i;
            }
        }

//............................. output ...................................................//

        System.out.println("======= Laporan konsumsi air =======");
        
        for(int i = 0; i < wilayah[i].length(); i++){
            System.out.printf("Wilayah %s: %s\n",wilayah[i],konsumsi[i] );
        }
        System.out.println();

        System.out.println("=== Rata-rata per-wilayah ===");

        for(int i = 0; i<wilayah[i].length(); i++){
            System.out.printf("Wilayah %s: %s\n",wilayah[i],ksmHarian[i]);
        }

        System.out.println("== Wilayah dengan penggunaan tertinggi ==");
        System.out.printf("Total tertinggi %s: %s",konsumsi[maxWilayah],maxWilayah);

    }
}
