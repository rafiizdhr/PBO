
// public class BarangGrosir {
//     String namaBarang, tanggalMasuk, tanggalKeluar;
//     int banyakDus, barangPerdus;

//     //metode khusus
//     public BarangGrosir(String namaBarang, String tanggalMasuk, String tanggalKeluar,
//     int banyakDus, int barangPerdus) {
//         this.namaBarang = namaBarang;
//         this.tanggalMasuk = tanggalMasuk;
//         this.tanggalKeluar = tanggalKeluar;
//         this.banyakDus = banyakDus;
//         this.barangPerdus = barangPerdus;
//     }

//     //metode
//     public void tambah() {
//         System.out.println("\nNama Barang           : " + this.namaBarang);
//         System.out.println("Tanggal Masuk Barang  : " + this.tanggalMasuk);
//         System.out.println("Tanggal Keluar Barang : " + this.tanggalKeluar);
//         System.out.println("Banyak Dus            : " + this.banyakDus);
//         System.out.println("Banyak Barang per Dus : " + this.barangPerdus);
//         System.out.println("Total Barang (pcs)    : " + this.banyakDus * this.barangPerdus);
//         System.out.println("\n--Barang berhasil ditambah--");
//     }

//     public void ubah() {
//         System.out.println("\nNama Barang           : " + this.namaBarang);
//         System.out.println("Tanggal Masuk Barang  : " + this.tanggalMasuk);
//         System.out.println("Tanggal Keluar Barang : " + this.tanggalKeluar);
//         System.out.println("Banyak Dus            : " + this.banyakDus);
//         System.out.println("Banyak Barang per Dus : " + this.barangPerdus);
//         System.out.println("Total Barang (pcs)    : " + this.banyakDus * this.barangPerdus);
//         System.out.println("\n--Barang berhasil diubah--");
//     }
// }

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

    public void tambah() {
                System.out.println("\n--Barang berhasil ditambah--");
            }

            public void ubah() {
                System.out.println("\n--Barang berhasil diubah--");
            }        
}
