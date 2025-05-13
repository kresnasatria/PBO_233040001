package pertemuan10_latihan1;

public class Main { // Mendeklarasikan kelas utama bernama 'Main'
    
    public static void main(String[] args) { // Metode main: titik awal eksekusi program Java
        
        // Membuat objek Lingkaran dengan jari-jari 10
        Lingkaran lingkaran = new Lingkaran(10); // Instansiasi objek Lingkaran dengan parameter jari2 = 10
        
        System.out.println("== Lingkaran =="); // Menampilkan header untuk bagian lingkaran
        System.out.println("jari2: " + lingkaran.getJari2()); // Menampilkan nilai jari-jari menggunakan getter
        System.out.println("luas:" + lingkaran.luas()); // Menampilkan hasil perhitungan luas lingkaran

        // Membuat objek Tabung dengan jari-jari 10 dan tinggi 5
        Tabung tabung = new Tabung(10, 5); // Instansiasi objek Tabung dengan jari2 = 10 dan tinggi = 5
        
        System.out.println("== Tabung =="); // Menampilkan header untuk bagian tabung
        System.out.println("jari2: " + tabung.getJari2() + ", Tinggi:" + tabung.getTinggi()); // Menampilkan jari-jari dan tinggi tabung menggunakan getter
        System.out.println("luas:" + tabung.luas()); // Menampilkan hasil perhitungan luas permukaan tabung
    }
}
