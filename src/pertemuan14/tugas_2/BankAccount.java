package Tugas_2;

//public class BankAccount {
//    // Variabel final: tidak bisa diubah setelah diinisialisasi
//    private final String accountNumber;
//    
//    // Saldo bisa berubah
//    protected double balance;
//
//    // Constructor
//    public BankAccount(String accountNumber) {
//        this.accountNumber = accountNumber;
//        this.balance = 0.0;
//    }
//
//    // Method untuk menambah saldo
//    public void deposit(double amount) {
//        if (amount > 0) {
//            balance += amount;
//        }
//    }
//
//    // Method final: tidak boleh dioverride
//    public final void displayAccountInfo() {
//        System.out.println("Nomor Rekening: " + accountNumber);
//        System.out.println("Saldo: Rp " + balance);
//    }
//}

public class BankAccount {

 // Variabel accountNumber bersifat final dan private
 // nilai hanya dapat diatur sekali (di constructor) dan tidak bisa diubah setelah itu
 private final String accountNumber;

 // Variabel balance bersifat protected
 // bisa diakses oleh subclass atau kelas dalam package yang sama
 protected double balance;

 // Constructor untuk menginisialisasi nomor rekening
 // Saldo awal diatur ke 0.0
 public BankAccount(String accountNumber) {
     this.accountNumber = accountNumber;
     this.balance = 0.0;
 }

 // Method untuk menambahkan saldo ke akun jika jumlahnya positif
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
     }
 }

 // Method final untuk menampilkan informasi rekening
 // Marking sebagai 'final' berarti method ini tidak boleh dioverride oleh subclass
 public final void displayAccountInfo() {
     System.out.println("Nomor Rekening: " + accountNumber);
     System.out.println("Saldo: Rp " + balance);
 }
}



