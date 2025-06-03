package Tugas_5;

public class TestMahasiswa {
    public static void main(String[] args) {
        // Membuat beberapa objek Mahasiswa
        Mahasiswa m1 = new Mahasiswa("230001", "Andi");
        Mahasiswa m2 = new Mahasiswa("230002", "Budi");
        Mahasiswa m3 = new Mahasiswa("230003", "Citra");

        // Menampilkan info tiap mahasiswa
        m1.displayInfo();
        m2.displayInfo();
        m3.displayInfo();

        // Menampilkan total mahasiswa yang telah dibuat
        System.out.println("Total mahasiswa terdaftar: " + Mahasiswa.getTotalMahasiswa());
    }
}

