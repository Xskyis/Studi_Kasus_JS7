import java.util.Scanner;

public class DataSiakad03 {
    Scanner sc = new Scanner(System.in);

    // Array of Mahasiswa03 objects
    Mahasiswa03[] mahasiswaArray = new Mahasiswa03[3];
    // Array of Matakuliah03 objects
    Matakuliah03[] matakuliahArray = new Matakuliah03[3];
    // Array of Penilaian03 objects
    Penilaian03[] penilaianArray = new Penilaian03[5];

    // Constructor to initialize the arrays with sample data
    DataSiakad03() {
        // Initialize Mahasiswa03 objects
        mahasiswaArray[0] = new Mahasiswa03("22001", "Ali Rahman", "TI");
        mahasiswaArray[1] = new Mahasiswa03("22002", "Budi Santoso", "TI");
        mahasiswaArray[2] = new Mahasiswa03("22003", "Citra Dewi", "SI");

        // Initialize Matakuliah03 objects
        matakuliahArray[0] = new Matakuliah03("MK001", "Struktur Data", 3);
        matakuliahArray[1] = new Matakuliah03("MK002", "Basis Data", 3);
        matakuliahArray[2] = new Matakuliah03("MK003", "Desain Web", 3);

        // Initialize Penilaian03 objects
        penilaianArray[0] = new Penilaian03(mahasiswaArray[0], matakuliahArray[0], 80, 85, 90);
        penilaianArray[1] = new Penilaian03(mahasiswaArray[0], matakuliahArray[1], 60, 75, 70);
        penilaianArray[2] = new Penilaian03(mahasiswaArray[1], matakuliahArray[0], 75, 70, 80);
        penilaianArray[3] = new Penilaian03(mahasiswaArray[2], matakuliahArray[1], 85, 90, 95);
        penilaianArray[4] = new Penilaian03(mahasiswaArray[2], matakuliahArray[2], 80, 90, 65);

    }

    // Method untuk menampilkan daftar mahasiswa
    void tampilDaftarMahasiswa() {
        System.out.println("Daftar Mahasiswa:");
        for (int i = 0; i < mahasiswaArray.length; i++) {
            mahasiswaArray[i].tampilMahasiswa();
        }
    }

    // Method untuk menampilkan daftar matakuliah
    void tampilDaftarMatakuliah() {
        System.out.println("Daftar Matakuliah:");
        for (int i = 0; i < matakuliahArray.length; i++) {
            matakuliahArray[i].tampilMatakuliah();
        }
    }

    // Method untuk menampilkan daftar penilaian
    void tampilDaftarPenilaian() {
        System.out.println("Daftar Penilaian:");
        for (int i = 0; i < penilaianArray.length; i++) {
            penilaianArray[i].hitungNilaiAkhir();
            System.out.println(penilaianArray[i].Mahasiswa.nama + " | " + penilaianArray[i].Matakuliah.namaMK + " | "
                    + penilaianArray[i].nilaiAkhir);
        }
    }

    // Method untuk mengurutkan dan menampilkan nilai berdasarkan nilai akhir
    // (menggunakan Bubble Sort)
    void urutkanNilaiAkhir() {
        for (int i = 0; i < penilaianArray.length - 1; i++) {
            for (int j = 0; j < penilaianArray.length - i - 1; j++) {
                penilaianArray[j].hitungNilaiAkhir();
                penilaianArray[j + 1].hitungNilaiAkhir();
                if (penilaianArray[j].nilaiAkhir < penilaianArray[j + 1].nilaiAkhir) {
                    Penilaian03 temp = penilaianArray[j];
                    penilaianArray[j] = penilaianArray[j + 1];
                    penilaianArray[j + 1] = temp;
                }
            }
        }
        System.out.println("Daftar Penilaian setelah diurutkan berdasarkan nilai akhir:");
        tampilDaftarPenilaian();
    }

    // Method untuk mencari mahasiswa berdasarkan NIM (menggunakan Linear Search)
    void cariMahasiswa() {
        System.out.print("Masukkan NIM mahasiswa yang dicari:");
        String nim = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < mahasiswaArray.length; i++) {
            if (mahasiswaArray[i].NIM.equals(nim)) {
                System.out.println(
                        "Mahasiswa ditemukan: " + "NIM: " + mahasiswaArray[i].NIM + " | Nama: " +mahasiswaArray[i].nama + " | Prodi: "+ mahasiswaArray[i].prodi);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }

}
