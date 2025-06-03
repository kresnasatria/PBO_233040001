package Tugas_1;

//Mendefinisikan kelas AppConfig untuk menyimpan konfigurasi aplikasi
public class AppConfig {

 // Konstanta static final untuk URL dasar API aplikasi
 // Bersifat static agar dapat diakses tanpa membuat objek
 // Bersifat final agar nilainya tidak bisa diubah
 public static final String BASE_URL = "https://www.myapp.com/api";

 // Konstanta untuk versi aplikasi
 // Cocok digunakan untuk logging atau validasi versi API
 public static final String APP_VERSION = "1.0.0";

 // Konstanta untuk waktu tunggu default (timeout) dalam milidetik
 // digunakan saat melakukan permintaan ke server
 public static final int DEFAULT_TIMEOUT = 5000; 
}



