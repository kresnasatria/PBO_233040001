package pertemuan6;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
    private String semester;
    private double ips;
    private List<MataKuliah> daftarMatakuliah;

    // Konstruktor
    public KartuHasilStudi(String semester) {
        this.semester = semester;
        this.daftarMatakuliah = new ArrayList<>();
    }

    // Method untuk menambahkan matakuliah
    public void addMataKuliah(MataKuliah matakuliah) {
        daftarMatakuliah.add(matakuliah);
    }

    // Method untuk menampilkan daftar matakuliah
    public String display() {
        StringBuilder sb = new StringBuilder();
        sb.append("Semester: ").append(semester).append("\n");
        for (MataKuliah mk : daftarMatakuliah) {
            sb.append(mk.display());
            sb.append("\n");
        }
        return sb.toString();
    }

    // Method untuk menghitung IPS (contoh implementasi)
    public void hitungIPS() {
        if (daftarMatakuliah.isEmpty()) {
            ips = 0.0;
            return;
        }
        double totalNilai = 0;
        int totalSKS = 0;
        for (MataKuliah mk : daftarMatakuliah) {
            totalNilai += mk.NilaiIndex() * mk.getSks();
            totalSKS += mk.getSks();
        }
        ips = totalSKS == 0 ? 0.0 : totalNilai / totalSKS;
    }

    // Getter dan Setter
    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public double getIps() {
        return ips;
    }

    public List<MataKuliah> getDaftarMatakuliah() {
        return daftarMatakuliah;
    }
}
