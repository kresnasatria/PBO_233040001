package pertemuan10_tugas;

public class Mobil extends Kendaraan implements Keamanan {
// Mendeklarasikan kelas 'Mobil' sebagai turunan dari kelas abstrak 'Kendaraan'
// dan sekaligus mengimplementasikan interface 'Keamanan'

    private String kodeRahasia;
    // Atribut private untuk menyimpan kode rahasia mobil (digunakan untuk otentikasi)

    public Mobil(String merk, String kodeRahasia) {
        super(merk);
        // Memanggil konstruktor dari kelas induk (Kendaraan) untuk mengatur nilai 'merk'
        this.kodeRahasia = kodeRahasia;
        // Mengatur nilai kodeRahasia sesuai parameter yang diberikan
    }

    @Override
    public void bergerak() {
        // Implementasi method abstrak dari kelas Kendaraan
        // Menampilkan informasi bahwa mobil bergerak di jalan dengan 4 roda
        System.out.println(merk + " bergerak di jalan raya dengan 4 roda.");
    }

    @Override
    public boolean otentikasi(String kodeInput) {
        // Implementasi method dari interface Keamanan
        // Membandingkan input kode dengan kode rahasia yang tersimpan
        return kodeRahasia.equals(kodeInput);
    }

    @Override
    public String generateKodeRahasia() {
        // Implementasi method dari interface Keamanan
        // Menghasilkan kode rahasia baru berdasarkan merk mobil
        // Contoh: jika merk = "Toyota", maka hasil: "MOBIL-TO-123"
        return "MOBIL-" + merk.substring(0, 2).toUpperCase() + "-123";
    }
}
