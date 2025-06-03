package Tugas_4;

public class DatabaseConnection {
    // Variabel static untuk menyimpan URL koneksi ke database
    public static String connectionString;

    // Static block
    static {
        // nilai connectionString 
        connectionString = "jdbc:mysql://localhost:3306/mydb";
        System.out.println("Static block: connectionString telah diinisialisasi.");
    }

    // Konstruktor kosong 
    public DatabaseConnection() {
    }
}

