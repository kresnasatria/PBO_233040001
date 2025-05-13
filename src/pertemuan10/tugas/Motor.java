package pertemuan10_tugas;

public class Motor extends Kendaraan implements Keamanan {
// Mendeklarasikan kelas 'Motor' sebagai turunan dari kelas abstrak 'Kendaraan'
// dan juga mengimplementasikan interface 'Keamanan'

    private String kodeRahasia;
    // Atribut private untuk menyimpan kode rahasia khusus motor (digunakan untuk otentikasi)

    public Motor(String merk, String kodeRahasia) {
        super(merk); 
        // Memanggil konstruktor dari kelas induk 'Kendaraan' untuk mengatur nilai 'merk'
        this.kodeRahasia = kodeRahasia; 
        // Mengatur nilai kodeRahasia dari parameter konstruktor
    }

    @Override
    public void bergerak() {
        // Implementasi method abstrak dari kelas 'Kendaraan'
        // Menampilkan cara motor bergerak
        System.out.println(merk + " melaju di jalan dengan 2 roda.");
    }

    @Override
    public boolean otentikasi(String kodeInput) {
        // Implementasi method dari interface 'Keamanan'
        // Melakukan pemeriksaan apakah input kode cocok dengan kode rahasia (tidak case-sensitive)
        return kodeRahasia.equalsIgnoreCase(kodeInput);
    }

    @Override
    public String generateKodeRahasia() {
        // Implementasi method dari interface 'Keamanan'
        // Menghasilkan kode rahasia baru berbasis merk dalam huruf kecil
        // Contoh: jika merk = "Honda", maka hasilnya: "MOTOR-honda-321"
        return "MOTOR-" + merk.toLowerCase() + "-321";
    }
}
