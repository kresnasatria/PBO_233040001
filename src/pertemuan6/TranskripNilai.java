package pertemuan6;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TranskripNilai {
    private Date tglCetak;
    private double ipk = 0.0;
    private List<KartuHasilStudi> kartuHasilStudi;
    private Mahasiswa mahasiswa;

    // Konstruktor
    public TranskripNilai(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.kartuHasilStudi = new ArrayList<>();
        this.tglCetak = new Date();
    }

    // Method untuk menghitung IPK
    public void hitungIPK() {
        if (kartuHasilStudi.isEmpty()) {
            ipk = 0.0;
            return;
        }
        double totalNilai = 0;
        int totalSKS = 0;
        for (KartuHasilStudi khs : kartuHasilStudi) {
            khs.hitungIPS();
            totalNilai += khs.getIps();
            totalSKS++;
        }
        ipk = totalSKS == 0 ? 0.0 : totalNilai / totalSKS;
    }

    // Method untuk menambahkan KHS
    public void addKHS(KartuHasilStudi khs) {
        kartuHasilStudi.add(khs);
    }

    // Method untuk menampilkan informasi Transkrip Nilai
    public void display() {
        System.out.println(mahasiswa.display());
        System.out.println("Tanggal Cetak: " + tglCetak.toString());
        System.out.println("IPK: " + ipk);
        for (KartuHasilStudi khs : kartuHasilStudi) {
            System.out.println(khs.display());
        }
    }

    // Getter dan Setter
    public Date getTglCetak() {
        return tglCetak;
    }

    public double getIpk() {
        return ipk;
    }

    public List<KartuHasilStudi> getKartuHasilStudi() {
        return kartuHasilStudi;
    }
}