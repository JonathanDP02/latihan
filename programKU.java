public class programKU {
    public static void TampilHinggaKei(int i) {
        for (int j = 1; j <= i; j++){
            System.out.print(j);
        }
    }

    public static int jumlah(int bil1, int bil2){
        return (bil1+bil2);
    }

    public static void TampilJumlah (int bil1, int bil2){
        TampilHinggaKei(jumlah(bil1, bil2));
    }

    public static void main(String[] args) {
        int temp = jumlah(1, 1);
        TampilJumlah(temp, 5);
    }
}
