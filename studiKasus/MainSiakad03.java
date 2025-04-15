import java.util.Scanner;

public class MainSiakad03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataSiakad03 data = new DataSiakad03();
        int menu;

        do {
            System.out.println("=== MENU SISTEM AKADEMIK POLINEMA ===");
            System.out.println("1.Tampilkan Daftar Mahasiswa");
            System.out.println("2.Tampilkan Daftar Matakuliah");
            System.out.println("3.Tampilkan Daftar Penilaian");
            System.out.println("4.Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5.Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0.Keluar");
            System.out.print("Pilih Menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    data.tampilDaftarMahasiswa();
                    break;
                case 2:
                    data.tampilDaftarMatakuliah();
                    break;
                case 3:
                    data.tampilDaftarPenilaian();
                    break;
                case 4:
                    data.urutkanNilaiAkhir();
                    break;
                case 5:
                    data.cariMahasiswa();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem akademik Polinema.");
                    break;
            }

        } while (menu != 0);
    }
}
