package pertemuan7;

public class TranskripNilaiMain {
    public static void main(String[] args) {
        MataKuliah mk1 = new MataKuliah("001", "Algoritma dan Pemograman 1",  3, "A", "DR. IR. Leony Lidya, M.T.");
        MataKuliah mk2 = new MataKuliah("002", "Algoritma dan Pemograman 2",  3, "A", "DR. IR. Leony Lidya, M.T.");
        MataKuliah mk3 = new MataKuliah("003", "Pemrograman Berorientasi Objek",  3, "A", "Siroj Nur Ulum, S.T., M.T.");

        KartuHasilStudi khs = new KartuHasilStudi("2023");
        khs.addMataKuliah(mk1);
        khs.addMataKuliah(mk2);
        khs.addMataKuliah(mk3);

        Mahasiswa mhs = new Mahasiswa("233040001", "Kresna Satria Dewantoro");

        TranskripNilai transkrip = new TranskripNilai(mhs);
        transkrip.addKHS(khs);
        transkrip.display();
    }
}