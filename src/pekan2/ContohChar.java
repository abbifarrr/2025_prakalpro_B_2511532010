package pekan2;

public class ContohChar {

	public static void main(String[] args) {
		// Deklarasi variabel char
		char huruf1 = 'A';
		char huruf2 = 'B';
		char angka = '7';
		char simbol = '#';
		
		// Menmapilan variabel char
		System.out.println ("Contoh Variabel Char:");
		System.out.println ("Huruf Pertama	:" + huruf1);
		System.out.println ("Huruf Kedua	:" + huruf2);
		System.out.println ("angka		:" + angka);	
		System.out.println ("simbol		:" + simbol);
		
		// Operasi char (berdasarkan kode Unicode/ASCII)
		char huruf3 = (char) (huruf1 + 1); // A (65) + 1 = B (66)
		System.out.println("Huruf 1 + 1 =" + huruf3);
		
		// Char juga bisa disimpam di dalam integer (kode Unicode/ASCII)
		int kodeHuruf = huruf1;
		String biner1 = String.format("%8s", Integer.toBinaryString(huruf1)).replace(' ', '0');
		System.out.println ("kode ASCII dari " + huruf1 + " = " + kodeHuruf);
		System.out.println ("kode BINER dari " + huruf1 + " = " + biner1);
		
		String kata = "" + huruf1 + huruf2 + angka + simbol;
		System.out.println ("Gabungan char menjadi string : " + kata);
	}

}
