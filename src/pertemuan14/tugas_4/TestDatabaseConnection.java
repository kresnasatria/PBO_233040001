package Tugas_4;

public class TestDatabaseConnection {
    public static void main(String[] args) {
        // Saat pertama kali mengakses DatabaseConnection.connectionString,
        // static block di DatabaseConnection sudah otomatis dijalankan.
        System.out.println("Nilai connectionString: " + DatabaseConnection.connectionString);
    }
}

