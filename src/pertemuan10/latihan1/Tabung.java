package pertemuan10_latihan1;

public class Tabung extends Bentuk { // Mendeklarasikan kelas 'Tabung' yang merupakan subclass dari kelas abstrak 'Bentuk'
    public int tinggi; // Mendeklarasikan atribut 'tinggi' dengan akses publik (bisa diakses langsung dari luar kelas)

    public Tabung() { // Konstruktor default 
        super(0); // Memanggil konstruktor superclass (Bentuk) dengan jari2 = 0
    }

    public Tabung(int jari2, int tinggi) { // Konstruktor dengan parameter jari-jari dan tinggi
        super(jari2); // Menginisialisasi nilai jari-jari melalui konstruktor superclass
        this.tinggi = tinggi; // Menginisialisasi atribut 'tinggi' dengan nilai parameter
    }

    // L: 2phi.r(r+t) --> Rumus luas permukaan tabung 

    @Override // Menandakan bahwa metode ini mengoverride metode abstrak 'luas()' dari kelas Bentuk
    public double luas() {
        return 2 * PHI * jari2 * (jari2 + tinggi); // Menghitung dan mengembalikan luas permukaan tabung
    }

    // Setter & Getter 

    public int getTinggi() { // Getter untuk mengambil nilai dari atribut 'tinggi'
        return tinggi;
    }

    public void setTinggi(int tinggi) { // Setter untuk mengatur nilai atribut 'tinggi'
        this.tinggi = tinggi;
    }
}
