package pertemuan7;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TranskripNilai {
    private Date tglCetak;
    private double IPK = 0.0;
    private List<KartuHasilStudi> daftarKHS;
    private Mahasiswa mahasiswa;

    public TranskripNilai(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.daftarKHS = new ArrayList<>();
        this.tglCetak = new Date();
    }

    public void hitungIPK() {
        double totalBobot = 0;
        double totalSKS = 0;
        for (KartuHasilStudi khs : daftarKHS) {
            totalBobot += khs.getIPS() * khs.getTotalSKS();
            totalSKS += khs.getTotalSKS();
        }
        IPK = (totalSKS > 0) ? totalBobot / totalSKS : 0;
    }

    public void addKHS(KartuHasilStudi khs) {
        daftarKHS.add(khs);
        hitungIPK();
    }

    public void display() {
        System.out.println(mahasiswa.display());
        System.out.println("Tanggal Cetak: " + tglCetak);
        System.out.println("IPK: " + IPK);
        for (KartuHasilStudi khs : daftarKHS) {
            System.out.println(khs.display());
        }
    }
}