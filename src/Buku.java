public abstract class Buku {
    private String judul;
    private String penulis;
    private int harga;

    public Buku(String judul, String penulis, int harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getHarga() {
        return harga;
    }

    // Abstract methods sesuai ketentuan nomor 1
    public abstract int hargaAkhir();
    public abstract String keterangan();

    // Method konkret sesuai ketentuan nomor 2 (Subclass tidak boleh meng-override ini)
    public final void tampilkanInfo() {
        System.out.println(judul + " (" + penulis + ")");
        System.out.println("Harga     : Rp" + String.format("%,d", getHarga()).replace(',', '.'));
        System.out.println("Keterangan : " + keterangan());
        System.out.println("Harga akhir : Rp" + String.format("%,d", hargaAkhir()).replace(',', '.'));
    }
}