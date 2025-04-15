import java.util.Scanner;

public class DataSiakad03 {
    Scanner sc = new Scanner(System.in);

    // Array of Mahasiswa03 objects
    Mahasiswa03[] mhsArr = new Mahasiswa03[3];
    // Array of Matakuliah03 objects
    Matakuliah03[] matkulArr = new Matakuliah03[3];
    // Array of Penilaian03 objects
    Penilaian03[] nilaiArr = new Penilaian03[5];

    DataSiakad03() {
        mhsArr[0] = new Mahasiswa03("22001", "Ali Rahman", "Informatika");
        mhsArr[1] = new Mahasiswa03("22002", "Budi Santoso", "Informatika");
        mhsArr[2] = new Mahasiswa03("22003", "Citra Dewi", "Sistem Informasi Bisnis");

        matkulArr[0] = new Matakuliah03("MK001", "Struktur Data", 3);
        matkulArr[1] = new Matakuliah03("MK002", "Basis Data", 3);
        matkulArr[2] = new Matakuliah03("MK003", "Desain Web", 3);

        nilaiArr[0] = new Penilaian03(mhsArr[0], matkulArr[0], 80, 85, 90);
        nilaiArr[1] = new Penilaian03(mhsArr[0], matkulArr[1], 60, 75, 70);
        nilaiArr[2] = new Penilaian03(mhsArr[1], matkulArr[0], 75, 70, 80);
        nilaiArr[3] = new Penilaian03(mhsArr[2], matkulArr[1], 85, 90, 95);
        nilaiArr[4] = new Penilaian03(mhsArr[2], matkulArr[2], 80, 90, 65);

    }

    // Method untuk menampilkan daftar mahasiswa
    void tampilDaftarMahasiswa() {
        System.out.println("Daftar Mahasiswa:");
        for (int i = 0; i < mhsArr.length; i++) {
            mhsArr[i].tampilMahasiswa();
        }
    }

    // Method untuk menampilkan daftar matakuliah
    void tampilDaftarMatakuliah() {
        System.out.println("Daftar Matakuliah:");
        for (int i = 0; i < matkulArr.length; i++) {
            matkulArr[i].tampilMatakuliah();
        }
    }

    // Method untuk menampilkan daftar penilaian
    void tampilDaftarPenilaian() {
        for (int i = 0; i < nilaiArr.length; i++) {
            nilaiArr[i].hitungNilaiAkhir();
            nilaiArr[i].tampilPenilaian();
        }
    }

    // Method untuk mengurutkan dan menampilkan nilai berdasarkan nilai akhir
    // (menggunakan Bubble Sort)
    void urutkanNilaiAkhir() {
        for (int i = 0; i < nilaiArr.length - 1; i++) {
            for (int j = 0; j < nilaiArr.length - i - 1; j++) {
                nilaiArr[j].hitungNilaiAkhir();
                nilaiArr[j + 1].hitungNilaiAkhir();
                if (nilaiArr[j].nilaiAkhir < nilaiArr[j + 1].nilaiAkhir) {
                    Penilaian03 temp = nilaiArr[j];
                    nilaiArr[j] = nilaiArr[j + 1];
                    nilaiArr[j + 1] = temp;
                }
            }
        }
        tampilDaftarPenilaian();
    }

    // Method untuk mencari mahasiswa berdasarkan NIM (menggunakan Linear Search)
    void cariMahasiswa() {
        System.out.print("Masukkan NIM mahasiswa yang dicari:");
        String cariNIM = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < mhsArr.length; i++) {
            if (mhsArr[i].NIM.equals(cariNIM)) {
                System.out.println("Mahasiswa ditemukan: " + "NIM: " + mhsArr[i].NIM + " | Nama: " +mhsArr[i].nama + " | Prodi: "+ mhsArr[i].prodi);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Mahasiswa dengan NIM " + cariNIM + " tidak ditemukan.");
        }
    }
}
