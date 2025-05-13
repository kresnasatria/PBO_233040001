package pertemuan10_latihan2; 

public class InterfaceMain { // Mendeklarasikan kelas utama bernama 'InterfaceMain'

    public static void main(String[] args) { // Method main: titik awal eksekusi program Java

        KartuElektronik kartu = new KartuElektronik("IF111", "123"); 
        // Membuat objek 'kartu' dari kelas KartuElektronik
        // Mengisi atribut 'kodeBank' dengan "IF111" dan 'pin' dengan "123"

        System.out.println("Otentikasi:"+ kartu.otentikasi("123")); 
        // Memanggil method 'otentikasi' pada objek kartu dengan input "123"
        // Karena PIN input ("123") cocok dengan PIN yang disimpan, maka akan mengembalikan true
        // Hasilnya akan ditampilkan di console: "Otentikasi:true"
    }
}
