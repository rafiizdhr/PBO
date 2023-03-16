
import java.util.*;
import java.io.*;

public class Main {
    //arraylist
    static ArrayList<BarangGrosir> grosir = new ArrayList<BarangGrosir>();
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

    public static void tmbhBarang() throws IOException {
        System.out.println("\n=======================================");
        System.out.println("|      Tambah Data Barang Grosir      |");
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

        BarangGrosir gros = new BarangGrosir(tmbhNama, tglMasuk, tglKeluar, jmlKardus, jmlBarang);//objek gros
        grosir.add(gros); //nambah data ke arraylist grosir
        gros.tambah();//manggil metod tambah
    }

    public static void baca() throws IOException {
        if (grosir.size() == 0) {
            System.out.println("\nData Masih Kosong !!!");
        } else {
            System.out.println("\n=====================================");
            System.out.println("|      List Data Barang Grosir      |");
            System.out.println("=====================================");
            for (int i = 0; i < grosir.size(); i++) {
                System.out.println((i + 1 ) + "\tNama Barang \t\t: " + grosir.get(i).getBarang());
                System.out.println("\tTanggal Masuk Barang \t: " + grosir.get(i).getTmasuk());
                System.out.println("\tTanggal Keluar Barang \t: " + grosir.get(i).getTkeluar());
                System.out.println("\tBanyak Dus \t\t: " + grosir.get(i).getDus());
                System.out.println("\tBanyak Barang per Dus \t: " + grosir.get(i).getBPerdus());
                System.out.println("\tTotal Barang (pcs) \t: " + grosir.get(i).getDus() * grosir.get(i).getBPerdus());
        }
        }
    }

    public static void updateBarang() throws IOException {
        baca();
        System.out.println("\n=======================================");
        System.out.println("|      Update Data Barang Grosir      |");
        System.out.println("=======================================");
        System.out.print("Masukan nomor list yang mau diubah : ");
        int index = Integer.parseInt(utk_input.readLine());
        int indexx = index -1;

        System.out.print("\nMasukan Nama Barang baru   : ");
        grosir.get(indexx).setBarang(utk_input.readLine());
        System.out.print("Masukan Tanggal Masuk      : ");
        grosir.get(indexx).setTmasuk(utk_input.readLine());
        System.out.print("Masukan Tanggal Keluar     : ");
        grosir.get(indexx).setTkeluar(utk_input.readLine());
        System.out.print("Banyak Dus                 : ");
        grosir.get(indexx).setDus(Integer.parseInt(utk_input.readLine()));
        System.out.print("Banyak Barang per Dus      : ");
        grosir.get(indexx).setBPerdus(Integer.parseInt(utk_input.readLine()));


        grosir.get(index-1).ubah();
        System.out.println("\nData pada nomor " + index + " berhasil diubah");

    }

    public static void hapusBarang() throws IOException {
        baca();
        System.out.println("\n========================================");
        System.out.println("|       Hapus Data Barang Grosir       |");
        System.out.println("========================================");
        System.out.print("Masukan nomor list yang mau dihapus : ");
        int index = Integer.parseInt(utk_input.readLine());
        int indexx = index - 1;
        grosir.remove(indexx);
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