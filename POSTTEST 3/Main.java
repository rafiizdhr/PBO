import java.util.*;
import java.io.*;

public class Main {
    //arraylist
    // static ArrayList<BarangGrosir> grosir = new ArrayList<BarangGrosir>();
    static ArrayList<no_elektronik> data_no_elektronik = new ArrayList<>();
    static ArrayList<elektronik> data_elektronik = new ArrayList<>();
    //buat input
    static BufferedReader utk_input = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception, InterruptedException {
        while(true) {
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            
            System.out.println("-PROGRAM PENDATAAN BARANG GROSIR-");
            System.out.println("---------------------------------");
            System.out.println("|              MENU             |");
            System.out.println("---------------------------------");
            System.out.println("|1. Tambah barang grosir\t|");
            System.out.println("|2. liat barang grosir\t\t|");
            System.out.println("|3. update barang grosir\t|");
            System.out.println("|4. hapus barang grosir\t\t|");
            System.out.println("|5. keluar program\t\t|");

            try {
                System.out.print("\nPilih angka untuk eksekusi : ");
                int pil = Integer.parseInt(utk_input.readLine());
            if (pil == 1) {
                tmbhBarang();
                Enter();
            } else if (pil == 2) {
                baca();
                Enter();
            } else if (pil == 3) {
                updateBarang();
                Enter();
            } else if (pil == 4) {
                hapusBarang();
                Enter();
            } else if (pil == 5) {
                System.out.println("\nProgram Berakhir.\n");
                break;
            } else {
                System.out.println("\nPilih yang bener yaaa!!!\n");
                Enter();
            }
        } catch (Exception e) {
            System.out.println("\nPilih yang bener yaaa!!!\n");
            Enter();
        }
        }
    }

    //menu tambah
    public static void tmbhBarang() throws IOException {
        int pil = 0;
            System.out.println("\n================================");
            System.out.println("|      Tambah Data Barang      |");
            System.out.println("================================");
            System.out.println("|1. Barang Non Elektronik\t|");
            System.out.println("|2. Barang Elektronik\t\t|");
            System.out.print("\nPilih angka untuk eksekusi : ");
            pil = Integer.parseInt(utk_input.readLine());

            if (pil == 1) {
                tmbh_noelek();
            } else if (pil == 2) {
                tmbh_elek();
            } else {
                System.out.println("\nPilih yang bener yaaa!!!\n");
                System.out.print("\033[H\033[2J");  
                System.out.flush();   
            }
    }

    public static void tmbh_noelek() throws IOException {
        System.out.println("\n=======================================");
        System.out.println("|  Tambah Data Barang Non Elektronik  |");
        System.out.println("=======================================");
        System.out.print("\nMasukan Nama Barang    : ");
        String tmbhNama = utk_input.readLine();
        System.out.print("Masukan Tanggal Masuk  : ");
        String tglMasuk = utk_input.readLine();
        System.out.print("Masukan Tanggal Keluar : ");
        String tglKeluar = utk_input.readLine();
        System.out.print("Banyak Dus             : ");
        int jmlKardus = Integer.parseInt(utk_input.readLine());
        System.out.print("Jumlah Barang per Dus  : ");
        int jmlBarang = Integer.parseInt(utk_input.readLine());

        System.out.print("Masukan Kategori Produk : ");
        String kategoriBarang = utk_input.readLine();
        System.out.print("Masukan harga barang : ");
        int hargaBarang = Integer.parseInt(utk_input.readLine());

        no_elektronik noelek = new no_elektronik(kategoriBarang, hargaBarang, tmbhNama, tglMasuk, tglKeluar, jmlKardus, jmlBarang);
        data_no_elektronik.add(noelek);
        noelek.tambah();
    }
    public static void tmbh_elek() throws IOException {
        System.out.println("\n=======================================");
        System.out.println("|    Tambah Data Barang Elektronik    |");
        System.out.println("=======================================");
        System.out.print("\nMasukan Nama Barang    : ");
        String tmbhNama = utk_input.readLine();
        System.out.print("Masukan Tanggal Masuk  : ");
        String tglMasuk = utk_input.readLine();
        System.out.print("Masukan Tanggal Keluar : ");
        String tglKeluar = utk_input.readLine();
        System.out.print("Banyak Dus             : ");
        int jmlKardus = Integer.parseInt(utk_input.readLine());
        System.out.print("Jumlah Barang per Dus  : ");
        int jmlBarang = Integer.parseInt(utk_input.readLine());

        System.out.print("Masukan Tipe Barang : ");
        String tipeBarang = utk_input.readLine();
        System.out.print("Masukan harga barang : ");
        int hargaBarang = Integer.parseInt(utk_input.readLine());

        elektronik elek = new elektronik(tipeBarang, hargaBarang, tmbhNama, tglMasuk, tglKeluar, jmlKardus, jmlBarang);
        data_elektronik.add(elek);
        elek.tambah();
    }
    
    //menu baca
    public static void baca() throws IOException {
        int pil = 0;
        System.out.println("\n================================");
        System.out.println("|       List Data Barang       |");
        System.out.println("================================");
        System.out.println("|1. Barang Non Elektronik\t|");
        System.out.println("|2. Barang Elektronik\t\t|");
        System.out.print("\nPilih angka untuk eksekusi : ");
        pil = Integer.parseInt(utk_input.readLine());

        if (pil == 1) {
            baca_noelek();
        } else if (pil == 2) {
            baca_elek();
        } else {
            System.out.println("\nPilih yang bener yaaa!!!\n");
            System.out.print("\033[H\033[2J");  
            System.out.flush();   
        }
    }

    public static void baca_noelek(){
        if (data_no_elektronik.size() == 0) {
            System.out.println("\nData Masih Kosong !!!");
        } else {
            System.out.println("\n=========================================");
            System.out.println("|    List Data Barang Non Elektronik    |");
            System.out.println("=========================================");
            for (int i = 0; i < data_no_elektronik.size(); i++) {
                System.out.println((i + 1 ) + "\tNama Barang \t\t: " + data_no_elektronik.get(i).getBarang());
                System.out.println("\tTanggal Masuk Barang \t: " + data_no_elektronik.get(i).getTmasuk());
                System.out.println("\tTanggal Keluar Barang \t: " + data_no_elektronik.get(i).getTkeluar());
                System.out.println("\tBanyak Dus \t\t: " + data_no_elektronik.get(i).getDus());
                System.out.println("\tBanyak Barang per Dus \t: " + data_no_elektronik.get(i).getBPerdus());

                System.out.println("\tKategori Produk \t: " + data_no_elektronik.get(i).getKategoriProduk());
                System.out.println("\tHarga Barang (pcs) \t: " + data_no_elektronik.get(i).getHarga());
                System.out.println("\tTotal Barang (pcs) \t: " + data_no_elektronik.get(i).getDus() * data_no_elektronik.get(i).getBPerdus() + "\n");
        }
        }
    }
    public static void baca_elek(){
        if (data_elektronik.size() == 0) {
            System.out.println("\nData Masih Kosong !!!");
        } else {
            System.out.println("\n=====================================");
            System.out.println("|    List Data Barang Elektronik    |");
            System.out.println("=====================================");
            for (int i = 0; i < data_elektronik.size(); i++) {
                System.out.println((i + 1 ) + "\tNama Barang \t\t: " + data_elektronik.get(i).getBarang());
                System.out.println("\tTanggal Masuk Barang \t: " + data_elektronik.get(i).getTmasuk());
                System.out.println("\tTanggal Keluar Barang \t: " + data_elektronik.get(i).getTkeluar());
                System.out.println("\tBanyak Dus \t\t: " + data_elektronik.get(i).getDus());
                System.out.println("\tBanyak Barang per Dus \t: " + data_elektronik.get(i).getBPerdus());

                System.out.println("\tTipe Barang \t\t: " + data_elektronik.get(i).getTipe());
                System.out.println("\tHarga Barang (pcs) \t: " + data_elektronik.get(i).getHarga());
                System.out.println("\tTotal Barang (pcs) \t: " + data_elektronik.get(i).getDus() * data_elektronik.get(i).getBPerdus() + "\n");
        }
        }
    }

    //menu update
    public static void updateBarang() throws IOException {
        int pil = 0;
        System.out.println("\n================================");
        System.out.println("|      Update Data Barang      |");
        System.out.println("================================");
        System.out.println("|1. Barang Non Elektronik\t|");
        System.out.println("|2. Barang Elektronik\t\t|");
        System.out.print("\nPilih angka untuk eksekusi : ");
        pil = Integer.parseInt(utk_input.readLine());

        if (pil == 1) {
            upd_noelek();
        } else if (pil == 2) {
            upd_elek();
        } else {
            System.out.println("\nPilih yang bener yaaa!!!\n");
            System.out.print("\033[H\033[2J");  
            System.out.flush();   
        }
    }

    public static void upd_noelek() throws IOException {
        baca_noelek();
        System.out.println("\n=========================================");
        System.out.println("|   Update Data Barang Non Elektronik   |");
        System.out.println("=========================================");
        System.out.print("Masukan nomor list yang mau diubah : ");
        int index = Integer.parseInt(utk_input.readLine());
        int indexx = index -1;

        System.out.print("\nMasukan Nama Barang baru   : ");
        data_no_elektronik.get(indexx).setBarang(utk_input.readLine());
        System.out.print("Masukan Tanggal Masuk      : ");
        data_no_elektronik.get(indexx).setTmasuk(utk_input.readLine());
        System.out.print("Masukan Tanggal Keluar     : ");
        data_no_elektronik.get(indexx).setTkeluar(utk_input.readLine());
        System.out.print("Banyak Dus                 : ");
        data_no_elektronik.get(indexx).setDus(Integer.parseInt(utk_input.readLine()));
        System.out.print("Banyak Barang per Dus      : ");
        data_no_elektronik.get(indexx).setBPerdus(Integer.parseInt(utk_input.readLine()));

        System.out.print("Masukan Kategori Produk    : ");
        data_no_elektronik.get(indexx).setKategoriProduk(utk_input.readLine());
        System.out.print("Masukan Harga              : ");
        data_no_elektronik.get(indexx).setHarga(Integer.parseInt(utk_input.readLine()));


        data_no_elektronik.get(index-1).ubah();
        System.out.println("\nData pada nomor " + index + " berhasil diubah");
    }
    public static void upd_elek() throws IOException {
        baca_elek();
        System.out.println("\n===========================================");
        System.out.println("|      Update Data Barang Elektronik      |");
        System.out.println("===========================================");
        System.out.print("Masukan nomor list yang mau diubah : ");
        int index = Integer.parseInt(utk_input.readLine());
        int indexx = index -1;

        System.out.print("\nMasukan Nama Barang baru   : ");
        data_elektronik.get(indexx).setBarang(utk_input.readLine());
        System.out.print("Masukan Tanggal Masuk      : ");
        data_elektronik.get(indexx).setTmasuk(utk_input.readLine());
        System.out.print("Masukan Tanggal Keluar     : ");
        data_elektronik.get(indexx).setTkeluar(utk_input.readLine());
        System.out.print("Banyak Dus                 : ");
        data_elektronik.get(indexx).setDus(Integer.parseInt(utk_input.readLine()));
        System.out.print("Banyak Barang per Dus      : ");
        data_elektronik.get(indexx).setBPerdus(Integer.parseInt(utk_input.readLine()));

        System.out.print("Masukan Tipe Barang        : ");
        data_elektronik.get(indexx).setTipe(utk_input.readLine());
        System.out.print("Masukan Harga              : ");
        data_elektronik.get(indexx).setHarga(Integer.parseInt(utk_input.readLine()));

        data_elektronik.get(index-1).ubah();
        System.out.println("\nData pada nomor " + index + " berhasil diubah");
    }

    //menu hapus
    public static void hapusBarang() throws IOException {
        int pil = 0;
        System.out.println("\n=================================");
        System.out.println("|       Hapus Data Barang       |");
        System.out.println("=================================");
        System.out.println("|1. Barang Non Elektronik\t|");
        System.out.println("|2. Barang Elektronik\t\t|");
        System.out.print("\nPilih angka untuk eksekusi : ");
        pil = Integer.parseInt(utk_input.readLine());

        if (pil == 1) {
            hps_noelek();
        } else if (pil == 2) {
            hps_elek();
        } else {
            System.out.println("\nPilih yang bener yaaa!!!\n");
            System.out.print("\033[H\033[2J");  
            System.out.flush();   
        }
    }

    public static void hps_noelek() throws IOException {
        baca_noelek();
        System.out.println("\n==========================================");
        System.out.println("|    Hapus Data Barang Non Elektronik    |");
        System.out.println("==========================================");
        System.out.print("Masukan nomor list yang mau dihapus : ");
        int index = Integer.parseInt(utk_input.readLine());
        int indexx = index - 1;
        data_no_elektronik.remove(indexx);
        System.out.println("\nData pada nomor " + index + " berhasil dihapus");
    }
    public static void hps_elek() throws IOException {
        baca_elek();
        System.out.println("\n========================================");
        System.out.println("|     Hapus Data Barang Elektronik     |");
        System.out.println("========================================");
        System.out.print("Masukan nomor list yang mau dihapus : ");
        int index = Integer.parseInt(utk_input.readLine());
        int indexx = index - 1;
        data_elektronik.remove(indexx);
        System.out.println("\nData pada nomor " + index + " berhasil dihapus");
    }

    public static void Enter() throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("\n===============================================");
        System.out.println("Silakan klik tombol apapun untuk melanjutkan.");
        String anyInput = input.nextLine();
        System.out.println("\n.");
    }
}