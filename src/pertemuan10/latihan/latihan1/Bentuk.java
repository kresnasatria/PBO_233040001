package pertemuan10_latihan1; 

public abstract class Bentuk { // Mendeklarasikan kelas abstrak bernama 'Bentuk', tidak bisa diinstansiasi langsung
    protected double PHI = 3.14; // Mendeklarasikan konstanta phi sebagai bilangan desimal, bersifat protected (dapat diakses oleh subclass)
    protected int jari2; // Mendeklarasikan atribut 'jari2' (jari-jari) dengan tipe data int, bersifat protected

    public Bentuk(int jari2) { // Konstruktor untuk kelas Bentuk, menerima parameter jari2
        super(); // Memanggil konstruktor dari superclass 
        this.jari2 = jari2; // Menginisialisasi atribut jari2 dengan nilai dari parameter
    }

    public abstract double luas(); // Mendeklarasikan metode abstrak 'luas', yang harus diimplementasikan oleh subclass

    // Setter & Getter

    public int getJari2() { // Getter untuk mengambil nilai dari atribut jari2
        return jari2;
    }

    public void setJari2(int jari2) { // Setter untuk mengubah nilai dari atribut jari2
        this.jari2 = jari2;
    }
}
