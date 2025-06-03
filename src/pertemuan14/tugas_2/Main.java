package Tugas_2;

public class Main {

 public static void main(String[] args) {

     // Membuat objek SavingsAccount dengan nomor rekening "9876543210"
     SavingsAccount sa = new SavingsAccount("9876543210");

     // Menyetorkan dana sebesar 2.500.000 ke rekening tersebut
     sa.deposit(2500000);

     // Menampilkan informasi lengkap rekening, termasuk jenis rekening
     sa.showDetailedInfo();
 }
}





