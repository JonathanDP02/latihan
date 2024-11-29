import java.util.Scanner;

public class Kubus07 {
    
    public static double hitungVolume(double sisi){
        return sisi*sisi*sisi;
    }

    public static double hitungPeemukaan(double sisi){
        return 6*(sisi*sisi);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sisi kubus: ");
        double sisi = sc.nextDouble();

        double volume = hitungVolume(sisi);
        double luasPermukaan = hitungPeemukaan(sisi);

        System.out.println("Volume kubus: " + volume);
        System.out.println("Luas permukaan kubus: " + luasPermukaan);
    }
}
