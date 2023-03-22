//nama tanggal banyak brg dus udah

public class no_elektronik extends BarangGrosir{
    private String kategoriProduk;
    private int harga;

    public no_elektronik(String kategoriProduk, int harga, String namaBarang, String tanggalMasuk, String tanggalKeluar,
    int banyakDus, int barangPerdus) {
        super(namaBarang, tanggalMasuk, tanggalKeluar, banyakDus, barangPerdus);
        this.kategoriProduk = kategoriProduk;
        this.harga = harga;
    }

    public String getKategoriProduk() {
        return kategoriProduk;
    }

    public void setKategoriProduk(String kategoriProduk) {
        this.kategoriProduk = kategoriProduk;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

}
