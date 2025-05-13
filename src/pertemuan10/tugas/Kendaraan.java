package pertemuan10_tugas; 

public abstract class Kendaraan { 
// Mendefinisikan kelas abstrak bernama 'Kendaraan'

    protected String merk; 
    // Variabel 'merk' bertipe String, bersifat protected

    public Kendaraan(String merk) { 
    // Konstruktor untuk menginisialisasi objek dengan nilai merk
        this.merk = merk; 
        // Menyimpan nilai parameter 'merk' ke atribut kelas
    }

    public abstract void bergerak(); 
    // Method abstrak: tidak memiliki implementasi di sini
    // Harus diimplementasikan oleh setiap subclass (kelas turunan)

    // Setter & Getter
    
    public String getMerk() { 
    // Getter untuk mengambil nilai atribut 'merk'
        return merk; 
    }

    public void setMerk(String merk) { 
    // Setter untuk mengubah nilai atribut 'merk'
        this.merk = merk; 
    }
}

