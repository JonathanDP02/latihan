import java.util.Scanner;

public class SepakBola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlTim;

        System.out.print(" Masukkan jumlah tim: ");
        jmlTim = sc.nextInt();
        sc.nextLine();

        String[] tim = new String[jmlTim];

//........................................................

        for(int i = 0; i < jmlTim; i++){
            System.out.printf("Nama tim %s : ",i+1);
            tim[i]=sc.nextLine();
        }

        int[][] skor = new int[jmlTim][jmlTim];
        int skorPertandingan;

        System.out.println("Masukkan skor pertandingan:");
        for(int i = 0; i < jmlTim; i++){
            for(int j = i + 1; j < jmlTim; j++){
                System.out.printf("%s VS %s, skor: ",tim[i],tim[j]);
                skorPertandingan = sc.nextInt();
                skor[i][j]=skorPertandingan;
                skor[j][i]=-skorPertandingan;
            }
        }

        System.out.printf("Tabel Skor Pertandingan\n");

        for(String tabel : tim){
            System.out.printf("\t\t%s" , tabel);
        }
        System.out.println();

        for(int i = 0; i < jmlTim; i++){
            System.out.println(tim[i]);
            for(int j = 0; j < jmlTim; j++){
                System.out.printf("\t\t %s",skor[i][j]);
            }
            System.out.println();
        }

        System.out.println("Total Skor: ");

        for(int i = 0; i<jmlTim; i++){
            int totalSkor = 0;
            for(int j = 0; j<jmlTim; j++){
                totalSkor += skor[i][j];
            }
            System.out.printf("%s total skor: %s\n", tim[i],totalSkor);
        }

    }
}
