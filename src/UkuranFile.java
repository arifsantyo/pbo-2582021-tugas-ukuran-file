import java.util.Scanner;

public class UkuranFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Jika memakai int untuk ukuran 3221225472 byte, terjadi integer overflow
        // karena nilai tersebut melebihi batas maksimum int.
        long ukuranByte;

        final double SATU_KB = 1024.0;

        System.out.print("Nama file     : ");
        String namaFile = input.nextLine();

        System.out.print("Ukuran (byte) : ");
        ukuranByte = input.nextLong();

        // Menggunakan 1024.0 agar pembagian menghasilkan double dan pecahannya tidak hilang.
        double ukuranKB = ukuranByte / SATU_KB;
        double ukuranMB = ukuranKB / SATU_KB;
        double ukuranGB = ukuranMB / SATU_KB;

        // Casting ke int membuang bagian pecahan karena int hanya menyimpan bilangan bulat.
        int ukuranMBBulat = (int) ukuranMB;

        double selisihPembulatan = ukuranMB - ukuranMBBulat;

        System.out.println();
        System.out.println("===== UKURAN FILE =====");
        System.out.println(namaFile);
        System.out.println("  " + ukuranByte + " byte");
        System.out.println("  " + ukuranKB + " KB");
        System.out.println("  " + ukuranMB + " MB");
        System.out.println("  " + ukuranGB + " GB");
        System.out.println();
        System.out.println("Dibulatkan ke MB  : " + ukuranMBBulat);
        System.out.println("Selisih pembulatan: " + selisihPembulatan);
    }
}
