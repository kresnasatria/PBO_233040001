package pertemuan3;

public class main  {
	public static void main (String[] args) {
		orang mhs1 = new orang("233040001", "Kresna", "gerlong");
		orang mhs2 = new orang("233040029", "Tyezar", "ciwastra");
		
		mhs1.masukKelas();
		System.out.println(mhs1.hadir);
		
		lingkaran L = new lingkaran(50);
		System.out.println("Luas lingkaran adalah" L.hitungLuas());
	}
}

