package pertemuan10_latihan2; 

public interface Kartu { // Mendeklarasikan interface bernama 'Kartu'

    public boolean otentikasi(String pin); 
    // Method abstrak: mendefinisikan kontrak bahwa setiap kelas yang mengimplementasikan interface ini 
    // harus menyediakan implementasi untuk mengecek autentikasi berdasarkan PIN (misalnya validasi password).
    // Mengembalikan nilai boolean: true jika PIN valid, false jika tidak.

    public String encode(String pin); 
    // Untuk mengenkripsi atau mengubah PIN ke bentuk lain (misalnya hash).
    // Mengembalikan hasil encoding sebagai String.
}
