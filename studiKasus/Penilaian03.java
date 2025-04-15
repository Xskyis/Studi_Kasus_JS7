public class Penilaian03 {
    Mahasiswa03 Mahasiswa;
    Matakuliah03 Matakuliah;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;

    Penilaian03(Mahasiswa03 Mahasiswa, Matakuliah03 Matakuliah, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.Mahasiswa = Mahasiswa;
        this.Matakuliah = Matakuliah;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
    
    void hitungNilaiAkhir() {
        this.nilaiAkhir = (0.3 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
    }
}
