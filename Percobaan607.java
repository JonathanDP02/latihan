import java.util.Scanner;

public class Percobaan607 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p,l,t,L,vol;

        System.out.print("Masukkan Panjang");
        p = sc.nextInt();
        System.out.print("Masukkan Lebar");
        l = sc.nextInt();
        System.out.print("Masukkan Tinggi");
        t = sc.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas Persegi Panjanf adalah " + L);

        vol = hitungVolume(t, p, l);
        System.out.println("Volume balok adalah " + vol);
    }

    static int hitungLuas(int pjg,int ib){
        int Luas = pjg*ib;
        return Luas;
    }

    static int hitungVolume (int tinggi, int a, int b){
        int volume = hitungLuas(a, b)*tinggi;
        return volume;
    }


}
