public class Penilaian031204 {
    Mahasiswa031204 Mahasiswa;
    Matakuliah031204 Matakuliah;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;

    Penilaian031204(Mahasiswa031204 Mahasiswa, Matakuliah031204 Matakuliah, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.Mahasiswa = Mahasiswa;
        this.Matakuliah = Matakuliah;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    void hitungNilaiAkhir() {
        this.nilaiAkhir = (0.3 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
    }

    void tampilPenilaian() {
        System.out.println("NIM: " + Mahasiswa.NIM + " | " + "Nama: " + Mahasiswa.nama + " | " + "Matakuliah: " + Matakuliah.namaMK + " | " + "Nilai Akhir: " + nilaiAkhir);
    }  
}
