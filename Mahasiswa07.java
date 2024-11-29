import java.util.Scanner;

public class Mahasiswa07 {
     
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int jmlMhs, jmlTgs;

        System.out.println("========== SIAKAD ==========");
        System.out.print("Masukkan jumlah mahasiswa: ");
        jmlMhs = sc.nextInt();
        System.out.print("Masukkan jumlah tugas: ");
        jmlTgs = sc.nextInt();

        int data [][] = new int[jmlMhs][jmlTgs];

        input(data, sc);
        tabel(data);

        int idx = tertinggi(data);
        System.out.printf("\nMahasiswa dengan nilai tertinggi adalah mahasiswa ke-%s\n", idx + 1);
        System.out.println();
        System.out.println("==== rata-rata nilai mahasiswa ====");
        rata(data);

    }

    public static void input(int data[][], Scanner sc){
        System.out.println();
        System.out.println("==== Masukkan nilai Mahasiswa ====");

        for(int i = 0; i < data.length; i++){
            System.out.printf("Masukkan nilai Mahasiswa ke-%s\n",i+1);
            int j = 0;
            while (j < data[i].length) {
                System.out.printf("Tugas ke-%s: ",j+1);
                data[i][j] = sc.nextInt();
                if (data[i][j] < 0 || data[i][j] > 100) {
                    System.out.println("!!!INPUT TIDAK VALID!!!");
                    continue;
                }else{
                    j++;
                }
            }
            System.out.println();
        }
    }

    public static void tabel(int data[][]){
        System.out.println("===== Tabel nilai Mahasiswa =====");
        System.out.println();
        System.out.printf("%-15s","");

        for(int i = 0; i < data[0].length; i++){
            System.out.printf("%-15s","Tugas " + (i+1));
        }
        System.out.println();

        for(int i = 0; i < data.length; i++){
            System.out.printf("%-15s", "Mahasiswa " +(i+1));
            for(int j = 0; j < data[i].length; j++){
                System.out.printf("%-15s", data[i][j]);
            }
            System.out.println();
        }
    }

    public static int tertinggi(int data[][]){
        int max = 0;
        int idx = -1;
        int total[] = new int[data.length];

        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data[i].length; j++){
                total[i] += data[i][j];
            }

            for(int j = 0; j < data[i].length; j++){
                if (total[i] > max) {
                    max = total[i];
                    idx = i;
                }
            }
        }
        return idx;
    }

    public static void rata(int data[][]){
        for(int i = 0; i < data.length; i++){
            int total = 0;
            for(int j = 0; j < data[i].length; j++){
                total += data[i][j];
            }
            double rata = total/data[i].length;
            System.out.printf("Rata-rata nilai mahasiswa ke-%s: %s\n", i+1, rata);
        }
    }
}
