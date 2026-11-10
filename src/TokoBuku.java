// Catatan: Penambahan commit kedua untuk logika keranjang

public class TokoBuku {

    public static int hitungTotal(Buku[] keranjang) {
        int total = 0;
        for (Buku b : keranjang) {
            b.tampilkanInfo();
            System.out.println("----------------------------------------");
            total += b.hargaAkhir();
        }
        return total;
    }

    public static void main(String[] args) {
        // Uji coba membuat instance dari abstract class (jika dijalankan akan error)
        // Buku b = new Buku("X", "Y", 1);

        BukuCetak cetak1 = new BukuCetak("Pemrograman Java", "John Doe", 120000, 750);
        BukuCetak cetak2 = new BukuCetak("Algoritma Dasar", "Jane Smith", 95000, 400);
        BukuDigital digital = new BukuDigital("Belajar OOP", "Ani Wijaya", 80000, 12.5);
        BukuAudio audio = new BukuAudio("Kisah Programmer", "Budi Santoso", 60000, 240);

        System.out.println("============== KERANJANG ==============");
        Buku[] keranjang = {cetak1, cetak2, digital, audio};

        int totalBayar = hitungTotal(keranjang);
        System.out.println("Total bayar  : Rp" + String.format("%,d", totalBayar).replace(',', '.'));
        System.out.println();

        System.out.println("============== LINK UNDUH ==============");
        BisaDiunduh[] unduhan = {digital, audio};

        for (BisaDiunduh item : unduhan) {
            System.out.println(item.linkUnduh());
        }
    }
}