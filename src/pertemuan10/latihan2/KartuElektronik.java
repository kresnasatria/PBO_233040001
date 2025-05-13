package pertemuan10_latihan2; 

public class KartuElektronik implements Kartu { // Mendefinisikan kelas 'KartuElektronik' yang mengimplementasikan interface 'Kartu'

    private String kodeBank; // Variabel private untuk menyimpan kode bank
    private String pin;      // Variabel private untuk menyimpan PIN pengguna

    public KartuElektronik(String kodeBank, String pin) { // Konstruktor untuk inisialisasi kodeBank dan pin
        super(); // Memanggil konstruktor superclass (dalam hal ini Object, karena tidak ada superclass eksplisit)
        this.kodeBank = kodeBank; // Menyimpan nilai parameter ke atribut kodeBank
        this.pin = pin;           // Menyimpan nilai parameter ke atribut pin
    }

    @Override
    public boolean otentikasi(String pinInput) { // Implementasi method 'otentikasi' dari interface 'Kartu'
        // Mengecek apakah pin input sama dengan pin yang disimpan
        if(pin.equals(pinInput)) // Jika cocok
            return true;         // Mengembalikan true (berhasil otentikasi)
        else
            return false;        // Jika tidak cocok, mengembalikan false
    }

    @Override
    public String encode(String pin) { // Implementasi method 'encode' dari interface 'Kartu'
        return null; // Belum diimplementasikan, hanya mengembalikan null
    }
}
