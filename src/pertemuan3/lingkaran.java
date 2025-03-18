package pertemuan3;

public class lingkaran {
	double jari;
	double phi;
	
	public lingkaran(float jari) {
		this.jari = jari;
		this.phi = 3.14 ;
	}
	
	public double hitungLuas() {
		return  phi * jari *  jari;
	}
}
