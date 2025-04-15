public class Matakuliah03 {
    String KodeMK;
    String namaMK;
    int sks;

    Matakuliah03(String KodeMK, String namaMK, int sks) {
        this.KodeMK = KodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    void tampilMatakuliah() {
        System.out.println("Kode MK: " + KodeMK + " | " + "Nama MK: " + namaMK + " | " + "SKS: " + sks);
    }
}
