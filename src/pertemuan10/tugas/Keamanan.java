package pertemuan10_tugas;

public interface Keamanan {
// Mendefinisikan interface bernama 'Keamanan'

    public boolean otentikasi(String kodeInput);
    // Method abstrak: mendeklarasikan bahwa setiap kelas yang mengimplementasikan interface ini 
    // harus menyediakan cara untuk melakukan otentikasi berdasarkan input kode
    // Mengembalikan nilai boolean: true jika kode benar, false jika salah

    public String generateKodeRahasia();
    // Method abstrak: kontrak bahwa kelas harus dapat menghasilkan atau membuat kode rahasia baru
    // Mengembalikan nilai String (berisi kode rahasia)
}
