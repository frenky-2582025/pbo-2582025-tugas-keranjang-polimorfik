// Catatan: Finalisasi subclass BukuCetak untuk commit ketiga
public class BukuCetak extends Buku {
    private int beratGram;

    public BukuCetak(String judul, String penulis, int harga, int beratGram) {
        super(judul, penulis, harga);
        this.beratGram = beratGram;
    }

    @Override
    public int hargaAkhir() {
        // Ongkir Rp5.000 per 500 gram (pembulatan ke atas untuk sisa gram)
        int ongkir = (int) Math.ceil((double) beratGram / 500) * 5000;
        return getHarga() + ongkir;
    }

    @Override
    public String keterangan() {
        int ongkir = (int) Math.ceil((double) beratGram / 500) * 5000;
        return beratGram + " gram, ongkir Rp" + String.format("%,d", ongkir).replace(',', '.');
    }
}