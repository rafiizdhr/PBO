package posttest_4;

public class BarangGrosir {
    private String namaBarang, tanggalMasuk, tanggalKeluar;
    private int banyakDus, barangPerdus;

    public String getBarang() {
        return namaBarang;
    }

    public void setBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getTmasuk() {
        return tanggalMasuk;
    }

    public void setTmasuk(String tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }

    public String getTkeluar() {
        return tanggalKeluar;
    }

    public void setTkeluar(String tanggalKeluar) {
        this.tanggalKeluar = tanggalKeluar;
    }

    public int getDus() {
        return banyakDus;
    }

    public void setDus(int banyakDus) {
        this.banyakDus = banyakDus;
    }

    public int getBPerdus() {
        return barangPerdus;
    }

    public void setBPerdus(int barangPerdus) {
        this.barangPerdus = barangPerdus;
    }

    public BarangGrosir(String namaBarang, String tanggalMasuk, String tanggalKeluar,
    int banyakDus, int barangPerdus) {
        this.namaBarang = namaBarang;
        this.tanggalMasuk = tanggalMasuk;
        this.tanggalKeluar = tanggalKeluar;
        this.banyakDus = banyakDus;
        this.barangPerdus = barangPerdus;
    }

    //overriding tambah dan ubah
    public static void tambah() {
        System.out.println("\n--Anda akan menambah barang!!--\n");
    }

    public static void ubah() {
        System.out.println("\n--Anda akan mengupdate barang--\n");
    }     
}
