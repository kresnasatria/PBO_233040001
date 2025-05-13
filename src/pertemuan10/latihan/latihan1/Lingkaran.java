package pertemuan10_latihan1;

public class Lingkaran extends Bentuk { // Mendeklarasikan kelas 'Lingkaran' yang merupakan turunan (subclass) dari kelas abstrak 'Bentuk'

    public Lingkaran(int jari2) { // Konstruktor kelas Lingkaran, menerima parameter jari-jari
        super(jari2); // Memanggil konstruktor dari superclass (Bentuk) untuk menginisialisasi nilai jari2
    }

    // L: PHI*r*r --> Rumus luas lingkaran 

    @Override // Menandakan bahwa metode ini mengoverride metode abstrak 'luas()' dari kelas Bentuk
    public double luas() {
        return PHI * jari2 * jari2; // Mengembalikan hasil perhitungan luas lingkaran menggunakan rumus PHI * r^2
    }
}
