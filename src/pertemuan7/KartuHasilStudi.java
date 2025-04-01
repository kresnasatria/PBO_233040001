package pertemuan7;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
    private String semester;
    private double ips;
    private List<MataKuliah> daftarMataKuliah;

    public KartuHasilStudi(String semester) {
        this.semester = semester;
        this.daftarMataKuliah = new ArrayList<>();
    }

    public void addMataKuliah(MataKuliah mataKuliah) {
        daftarMataKuliah.add(mataKuliah);
        hitungIPS();
    }
    public void hitungIPS() {
        double totalBobot = 0;
        double totalSKS = 0;
        for (MataKuliah mk : daftarMataKuliah) {
            totalBobot += mk.nilaiIndex() * mk.getSks();
            totalSKS += mk.getSks();
        }
        ips = (totalSKS > 0) ? totalBobot / totalSKS : 0;
    }

    public int getTotalSKS() {
        int totalSKS = 0;
        for (MataKuliah mk : daftarMataKuliah) {
            totalSKS += mk.getSks();
        }
        return totalSKS;
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        for (MataKuliah mk : daftarMataKuliah) {
            sb.append(mk.display()).append(" | Semester: ").append(semester).append("\n");
        }
        return sb.toString();
    }

    public double getIPS() {
        return ips;
    }
}

