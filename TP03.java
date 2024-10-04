import java.util.Scanner; 

public class TP03 {
    
    public static boolean kotakMasuk(int panjang, int lebar, int sisiKotak){
        return sisiKotak <= panjang && sisiKotak <= lebar;
    }

    public static void main(final String[]args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang persegi panjang: ");
        int panjang = input.nextInt();

        System.out.print("Masukkan lebar persegi panjang: ");
        int lebar = input.nextInt();

        System.out.print("Masukkan sisi kotak: ");
        int sisiKotak = input.nextInt();

        boolean hasil = kotakMasuk(panjang, lebar, sisiKotak);

        System.out.println("Kotak dapat masuk ke dalam Persegi Panjang? " + hasil);

        input.close();
    }
}
