package Tugas_3;

public class Counter {
    // Variabel static: berbagi nilai antar semua objek
    private static int instanceCount = 0;

    // Konstruktor: setiap kali objek dibuat, instanceCount bertambah
    public Counter() {
        instanceCount++;
    }

    // Method static: bisa dipanggil tanpa objek, mengembalikan jumlah instansi
    public static int getInstanceCount() {
        return instanceCount;
    }
}


