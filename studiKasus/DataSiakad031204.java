import java.util.Scanner;

public class DataSiakad031204 {
    Scanner sc = new Scanner(System.in);

    // Array of Mahasiswa03 objects
    Mahasiswa031204[] mhsArr = new Mahasiswa031204[3];
    // Array of Matakuliah03 objects
    Matakuliah031204[] matkulArr = new Matakuliah031204[3];
    // Array of Penilaian03 objects
    Penilaian031204[] nilaiArr = new Penilaian031204[5];

    DataSiakad031204() {
        mhsArr[0] = new Mahasiswa031204("22001", "Ali Rahman", "Informatika");
        mhsArr[1] = new Mahasiswa031204("22002", "Budi Santoso", "Informatika");
        mhsArr[2] = new Mahasiswa031204("22003", "Citra Dewi", "Sistem Informasi Bisnis");

        matkulArr[0] = new Matakuliah031204("MK001", "Struktur Data", 3);
        matkulArr[1] = new Matakuliah031204("MK002", "Basis Data", 3);
        matkulArr[2] = new Matakuliah031204("MK003", "Desain Web", 3);

        nilaiArr[0] = new Penilaian031204(mhsArr[0], matkulArr[0], 80, 85, 90);
        nilaiArr[1] = new Penilaian031204(mhsArr[0], matkulArr[1], 60, 75, 70);
        nilaiArr[2] = new Penilaian031204(mhsArr[1], matkulArr[0], 75, 70, 80);
        nilaiArr[3] = new Penilaian031204(mhsArr[2], matkulArr[1], 85, 90, 95);
        nilaiArr[4] = new Penilaian031204(mhsArr[2], matkulArr[2], 80, 90, 65);

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
                    Penilaian031204 temp = nilaiArr[j];
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
        for (Mahasiswa031204 mhs : mhsArr) {
            if (mhs.NIM.equals(cariNIM)) {
                System.out.print("Mahasiswa ditemukan: ");
                mhs.tampilMahasiswa();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Mahasiswa dengan NIM " + cariNIM + " tidak ditemukan.");
        }
    }
}
