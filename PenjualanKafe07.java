import java.util.Scanner;

public class PenjualanKafe07 {
    
    static int [][] sales = new int[5][7];
    static String [] menu = {"kopi      ", "Teh      ", "Es Degan", "Roti Bakar", "Gorengan"};

    public static void input(){
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Masukkan data penjual ===");
        for(int i = 0; i < sales.length; i++){
            System.out.printf("==== Penjualan %s ====\n",menu[i] );
            for(int j = 0; j < sales[i].length; j++){
                System.out.printf("Hari ke-%s: ",j+1 );
                sales[i][j] = sc.nextInt();
            }
        }
    }

    public static void output(){
        System.out.println("========== Data penjualan ==========");
        System.out.println();
        System.out.printf("Menu\t\tHari 1\tHari 2\tHari 3\tHari 4\tHari 5\tHari 6\tHari 7\n");
        for(int i =0; i < sales.length; i++){
            System.out.print(menu[i]+"\t");
            for(int j = 0; j < sales[i].length; j++){
                System.out.print(sales[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void tertinggi(){
        int max = 0;
        int idx = 0;

        for(int i = 0; i < sales.length; i++){
            for(int j = 0; j < sales[i].length; j++){
                if (sales[i][j] > max) {
                    max = sales[i][j];
                    idx = i;
                }
            }
        }
        System.out.println();
        System.out.println("Manu dengan penjualan tertinggi: " + menu[idx]);
    }

    public static void rata(){
        int total = 0;

        for(int i = 0; i < sales.length; i++){
            for(int j = 0; j < sales[i].length; j++){
                total += sales[i][j];
            }
        }
        System.out.println("Rata-rata penjualan: "+ (double)total/(sales.length*sales[0].length));
    }

    public static void main(String[] args) {
        input();
        output();
        tertinggi();
        rata();

    }
}
