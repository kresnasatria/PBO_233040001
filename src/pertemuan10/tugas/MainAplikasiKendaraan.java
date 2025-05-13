package pertemuan10_tugas;

public class MainAplikasiKendaraan {
// Mendefinisikan kelas publik bernama 'MainAplikasiKendaraan'
// Kelas ini berisi method main untuk menjalankan program

    public static void main(String[] args) {
    // Method utama yang menjadi titik awal eksekusi program Java

        Mobil mobil = new Mobil("Toyota", "abc123");
        // Membuat objek 'mobil' dari kelas Mobil dengan merk "Toyota" dan kode rahasia "abc123"

        Motor motor = new Motor("Honda", "xyz789");
        // Membuat objek 'motor' dari kelas Motor dengan merk "Honda" dan kode rahasia "xyz789"

        System.out.println("== INFO MOBIL ==");
        // Menampilkan judul informasi untuk mobil

        mobil.bergerak();
        // Memanggil method 'bergerak()' dari objek mobil untuk menampilkan cara mobil bergerak

        System.out.println("Kode rahasia baru: " + mobil.generateKodeRahasia());
        // Menampilkan hasil generate kode rahasia baru untuk mobil

        System.out.println("Otentikasi sukses? " + mobil.otentikasi("abc123"));
        // Menampilkan hasil autentikasi berdasarkan input kode "abc123"

        System.out.println("\n== INFO MOTOR ==");
        // Menampilkan judul informasi untuk motor, diawali baris baru

        motor.bergerak();
        // Memanggil method 'bergerak()' dari objek motor untuk menampilkan cara motor bergerak

        System.out.println("Kode rahasia baru: " + motor.generateKodeRahasia());
        // Menampilkan hasil generate kode rahasia baru untuk motor

        System.out.println("Otentikasi sukses? " + motor.otentikasi("XYZ789"));
        // Menampilkan hasil autentikasi berdasarkan input kode "XYZ789" (dengan huruf kapital, tapi tetap cocok karena equalsIgnoreCase)
    }
}
