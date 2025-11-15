package pekan7_2511532010;
import java.util.Scanner;
public class Registrasi {

	public static void main(String[] args) {
		Akun a = new Akun ();
		Scanner input = new Scanner (System.in);
		System.out.println ("===== REGISTRASI AKUN BARU =====");
		System.out.print ("Masukkan Username: ");
		a.setusername (input.nextLine());
		System.out.print ("Masukkan Password: ");
		a.setpassword (input.nextLine());
		System.out.print("Masukkan Email: ");
		a.setemail (input.nextLine());
		System.out.print ("Masukkan PIN (6 digit): ");
		a.setpinAngka (input.nextInt());
		
		
		if (Akun.isEmailValid(a.getemail())) {
			System.out.println ();
			System.out.println ("--- REGISTRASI BERHASIL ---");
			System.out.println ("Akun untuk \"" + a.getemail() + "\" telah berhasil dibuat");
			System.out.println();
			System.out.println ("--- Detail Akun ---");
			System.out.println ("Username (lowercase) : " + a.getusername().toLowerCase());
			System.out.println ("Email (Uppercase) : " + a.getemail().toUpperCase());
			System.out.println ("ID Pengguna (Gabungan) : " + a.getusername() + a.getpinAngka());
			System.out.println();
			System.out.println ("--- Uji Tipe Data (PIN Anda: " + a.getpinAngka() +") ---");
			System.out.println ("PIN (int) + 10 = " + (a.getpinAngka() + 10));
			System.out.println ("PIN (String) + \"10\" = " + a.getpinAngka() + 10);} 
		else {
			System.out.println ("--- Registrasi Gagal ---");
			System.out.println ("Email Anda \"" + a.getemail() + "\" tidak valid(harus mengandung '@' dan '.').");
			System.out.println ("Silahkan coba lagi.");}
		
		}}
