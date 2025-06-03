package Tugas_2;


// Error
//public class SavingsAccount extends BankAccount {
//
//    public SavingsAccount(String accountNumber) {
//        super(accountNumber);
//    }
//
//    // ERROR: Cannot override the final method from BankAccount
//    @Override
//    public void displayAccountInfo() {
//        System.out.println("Percobaan override di subclass SavingsAccount.");
//    }
//}


public class SavingsAccount extends BankAccount {

 // Constructor untuk SavingsAccount, menerima parameter accountNumber
 // Meneruskan nilai accountNumber ke constructor superclass (BankAccount)
 public SavingsAccount(String accountNumber) {
     super(accountNumber); // memanggil constructor dari BankAccount
 }

 // Method tambahan khusus untuk SavingsAccount
 // Menampilkan informasi rekening (dari superclass) + jenis rekening
 public void showDetailedInfo() {
     super.displayAccountInfo(); // memanggil method final dari BankAccount
     System.out.println("Jenis Rekening: Tabungan"); 
 }
}




