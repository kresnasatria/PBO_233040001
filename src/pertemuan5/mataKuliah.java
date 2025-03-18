package pertemuan5;

public class mataKuliah {
    private String kode;
    private String nama;
    private String index;
    private int sks;

    /* Konstruktor */
    public mataKuliah(String kode, String nama, String index, int sks) {
        super();
        this.kode = kode;
        this.nama = nama;
        this.index = index;
        this.sks = sks;
    }

    /* Method untuk menghitung nilai index berdasarkan ketentuan */
    public double nilaiIndex() {
        switch (index) {
            case "A":
                return 4.0;
            case "AB":
                return 3.5;
            case "B":
                return 3.0;
            case "BC":
                return 2.5;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            case "E":
                return 0.0;
            default:
                return 0.0; // Jika tidak ada dalam daftar, kembalikan 0
        }
    }

    /* Method untuk menampilkan informasi matakuliah */
    public String display() {
        return kode + " - " + nama + " - " + index;
    }

    /* Getter untuk SKS */
    public int getSks() {
        return sks;
    }
}
