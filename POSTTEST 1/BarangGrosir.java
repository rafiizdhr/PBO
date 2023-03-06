
public class BarangGrosir {
    String namaBarang, jenisBarang, tanggalMasuk, tanggalKeluar;
    int banyakDus, barangPerdus;

    //metode khusus
    public BarangGrosir(String namaBarang, String jenisBarang, String tanggalMasuk, String tanggalKeluar,
    int banyakDus, int barangPerdus) {
        this.namaBarang = namaBarang;
        this.jenisBarang = jenisBarang;
        this.tanggalMasuk = tanggalMasuk;
        this.tanggalKeluar = tanggalKeluar;
        this.banyakDus = banyakDus;
        this.barangPerdus = barangPerdus;
    }

    //metode
    public void tambah() {
        System.out.println("\nNama Barang           : " + this.namaBarang);
        System.out.println("Jenis Barang          : " + this.jenisBarang);
        System.out.println("Tanggal Masuk Barang  : " + this.tanggalMasuk);
        System.out.println("Tanggal Keluar Barang : " + this.tanggalKeluar);
        System.out.println("Banyak Dus            : " + this.banyakDus);
        System.out.println("Banyak Barang per Dus : " + this.barangPerdus);
        System.out.println("Total Barang (pcs)    : " + this.banyakDus * this.barangPerdus);
        System.out.println("\n--Barang berhasil ditambah--");
    }

    public void ubah() {
        System.out.println("\nNama Barang           : " + this.namaBarang);
        System.out.println("Jenis Barang          : " + this.jenisBarang);
        System.out.println("Tanggal Masuk Barang  : " + this.tanggalMasuk);
        System.out.println("Tanggal Keluar Barang : " + this.tanggalKeluar);
        System.out.println("Banyak Dus            : " + this.banyakDus);
        System.out.println("Banyak Barang per Dus : " + this.barangPerdus);
        System.out.println("Total Barang (pcs)    : " + this.banyakDus * this.barangPerdus);
        System.out.println("\n--Barang berhasil diubah--");
    }
}