//nama tanggal banyak brg dus udah

public class elektronik extends BarangGrosir{
    private String tipe;
    private int harga;

    public elektronik(String tipe, int harga, String namaBarang, String tanggalMasuk, String tanggalKeluar,
    int banyakDus, int barangPerdus) {
        super(namaBarang, tanggalMasuk, tanggalKeluar, banyakDus, barangPerdus);
        this.tipe = tipe;
        this.harga = harga;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
