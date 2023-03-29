package posttest_4;

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

    //overriding tambah dan ubah
    public static void tambah() {
        System.out.println("\n--Barang jenis non elektronik berhasil ditambah--\n");
    }

    public static void ubah() {
        System.out.println("\n--Barang jenis non elektronik berhasil diubah--\n");
    }

    //overloading update dan delete
    public static void overload_no_elektronik(int indexx, String namaBarang, String tanggalMasuk, String tanggalKeluar, int banyakDus, int barangPerdus, String kategoriProduk, int harga){
        Main .data_no_elektronik.get(indexx).setBarang(namaBarang);
        Main .data_no_elektronik.get(indexx).setTmasuk(tanggalMasuk);
        Main .data_no_elektronik.get(indexx).setTkeluar(tanggalKeluar);
        Main .data_no_elektronik.get(indexx).setDus(banyakDus);
        Main .data_no_elektronik.get(indexx).setBPerdus(barangPerdus);
        Main .data_no_elektronik.get(indexx).setKategoriProduk(kategoriProduk);
        Main .data_no_elektronik.get(indexx).setHarga(harga);
    }

    public static void overload_no_elektronik(int indexx, int index) {
        Main.data_no_elektronik.remove(indexx);
        System.out.println("\nData pada nomor " + index + " berhasil dihapus");
    }
}
