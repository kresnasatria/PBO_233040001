package pertemuan5;

public class gelasMain {
    public static void main(String[] args) {
        // Instansiasi objek Gelas
        gelas g1 = new gelas("Hitam");
        gelas g2 = new gelas("Biru");

        // Menukar warna gelas
        tukarWarnaGelas(g1, g2);

        // Output hasil setelah ditukar
        System.out.println("Warna g1: " + g1.getWarna());
        System.out.println("Warna g2: " + g2.getWarna());
    }

    // Method untuk menukar warna gelas
    static void tukarWarnaGelas(gelas g1, gelas g2) {
        gelas gTemp = new gelas("Temp"); // Objek sementara untuk menampung warna

        gTemp.setWarna(g1.getWarna()); // Simpan warna g1 di gTemp
        g1.setWarna(g2.getWarna());    // Isi warna g1 dengan warna g2
        g2.setWarna(gTemp.getWarna()); // Isi warna g2 dengan warna dari gTemp
    }
}
