package posttest_5;

public final class elektronik extends BarangGrosir{
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

    //overriding tambah dan ubah
    public static void tambah() {
        System.out.println("\n--Barang jenis elektronik berhasil ditambah--\n");
    }

    public static void ubah() {
        System.out.println("\n--Barang jenis elektronik berhasil diubah--\n");
    }

    //overloading update dan delete
    public static void overload_elektronik(int indexx, String namaBarang, String tanggalMasuk, String tanggalKeluar, int banyakDus, int barangPerdus, String tipe, int harga){
        Main.data_elektronik.get(indexx).setBarang(namaBarang);
        Main.data_elektronik.get(indexx).setTmasuk(tanggalMasuk);
        Main.data_elektronik.get(indexx).setTkeluar(tanggalKeluar);
        Main.data_elektronik.get(indexx).setDus(banyakDus);
        Main.data_elektronik.get(indexx).setBPerdus(barangPerdus);
        Main.data_elektronik.get(indexx).setTipe(tipe);
        Main.data_elektronik.get(indexx).setHarga(harga);
    }

    public static void overload_elektronik(int indexx, int index) {
        Main.data_elektronik.remove(indexx);
        System.out.println("\nData pada nomor " + index + " berhasil dihapus");
    }

    public void clear(){
        System.out.println("\n| Data barang elektronik masih kosong!! |\n");
    }
}
