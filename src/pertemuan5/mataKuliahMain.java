package pertemuan5;

public class mataKuliahMain {
    public static void main(String[] args) {
        // Create objek matakuliah
        mataKuliah mk1 = new mataKuliah("001", "Algoritma Pemrograman 1", "A", 3);
        mataKuliah mk2 = new mataKuliah("002", "Algoritma Pemrograman 2", "BC", 3);
        mataKuliah mk3 = new mataKuliah("003", "Pemrograman Berorientasi Objek", "B", 3);

        // Tampilkan daftar matakuliah
        System.out.println("--- DAFTAR MATAKULIAH ---");
        System.out.println(mk1.display());
        System.out.println(mk2.display());
        System.out.println(mk3.display());

        // Hitung total nilai x sks dan total sks
        double totalNilaiKaliSks = (mk1.nilaiIndex() * mk1.getSks()) + 
                                  (mk2.nilaiIndex() * mk2.getSks()) + 
                                  (mk3.nilaiIndex() * mk3.getSks());
        int totalSks = mk1.getSks() + mk2.getSks() + mk3.getSks();

        // Hitung IPK
        double ipk = totalNilaiKaliSks / totalSks;

        // Tampilkan IPK
        System.out.println("--- Nilai IPK ---");
        System.out.println("IPK: " + ipk);
    }
}
