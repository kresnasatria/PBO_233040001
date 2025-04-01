package pertemuan7;

public class Mahasiswa {
    private String NRP;
    private String nama;

    public Mahasiswa(String nRP, String nama) {
        this.NRP = nRP;
        this.nama = nama;
    }

    public String display() {
        return "NRP: " + NRP + ", Nama: " + nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNRP(String NRP) {
        this.NRP = NRP;
    }

    public String getNama() {
        return nama;
    }

    public String getNRP() {
        return NRP;
    }
}