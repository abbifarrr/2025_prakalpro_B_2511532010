package pekan4;

import java.util.Scanner;

public class tugasAlproPekan4_2511532010 {

	public static void main(String[] args) {
		
			String nama;
			double berat;
			int jarak;
			int jenislayanan;
			int jenispaket;
			
			//INPUT
			Scanner input = new Scanner (System.in);
			System.out.print("Nama pengirim : ");
			nama = input.nextLine();
			System.out.print("Berat paket dalam kg : ");
			berat = input.nextDouble();
			System.out.print ("Jarak pengiriman dalam km : ");
			jarak = input.nextInt();
			System.out.print("Jenis Layanan (1=Reguler, 2=Express, 3=Same Day) : ");
			jenislayanan = input.nextInt();
			System.out.print("Jenis paket (1=Dokumen, 2=Barang Biasa, 3=Barang Elektronik) : ");
			jenispaket = input.nextInt();
			input.close();
			
			//HARGA DASAR
			int hargadasar = 0;
			if (berat >= 3 ) {hargadasar = 22500;}
			else if (berat >= 1) {hargadasar = 15000;}
			else if (berat > 0)  {hargadasar = 7500;}
			else {System.out.print("BERAT TIDAK VALID"); return;}
			
			//HITUNG BIAYA JARAK
			int biayajarak;
			if (jarak >= 20) {biayajarak = 15000;}
			else if (jarak >= 10) {biayajarak = 10000;}
			else if (jarak > 0)  {biayajarak = 5000;}
			else {System.out.print("JARAK TIDAK VALID"); return;}
			
			//HITUNG SUBTOTAL
			int subtotal = hargadasar + biayajarak;
			
			//HITUNG BIAYA LAYANAN
			double biayalayanan = 0;
			String namalayanan = "";
			if (jenislayanan == 1) { //REGULER
				biayalayanan = 0.25 * subtotal;
				namalayanan = "Reguler";
			}else if (jenislayanan == 2) { //EXPRESS
				biayalayanan = 0.50 * subtotal;
				namalayanan = "Express";
			}else if (jenislayanan == 3) { //SAME DAY
				biayalayanan = 0.75 * subtotal;
				namalayanan = "Same Day";
			}else {System.out.print("JENIS LAYANAN TIDAK VALID"); return;}
			
			//BIAYA JENIS PAKET
			int biayajenis = 0;
			String namapaket = "";
			if (jenispaket == 1) { //DOKUMEN
				biayajenis = 5000;
				namapaket = "Dokumen";
			}else if (jenispaket == 2) { //BARANG BIASA
				biayajenis = 10000;
				namapaket = "Barang Biasa";
			}else if (jenispaket == 3) { //BARANG ELEKTRONIK
				biayajenis = 15000;
				namapaket = "Barang Elektronik";
			}else {System.out.print("JENIS PAKET TIDAK VALID"); return;}
			
			//TOTAL SEBELUM DISKON
			double ttl = subtotal + biayalayanan + biayajenis;
			
			//DISKON
			double diskon = 0;
			if (ttl >= 150000) {
				diskon = ttl * 0.25;
			}else diskon = ttl * 0;
			
			//TOTAL HARGA
			double totalharga = ttl - diskon;
			
			//OUTPUT
			System.out.println ("\n===== BIAYA PENGIRIMAN PAKET =====");
			System.out.println ("Nama Pengirim    : " + nama);
			System.out.println ("Berat Paket      : " + berat + " kg");
			System.out.println ("Jarak Pengiriman : " + jarak + " km");
			System.out.println ("Jenis Layanan    : " + namalayanan);
			System.out.println ("Jenis Paket      : " + namapaket);
			System.out.println ("--------------------------------------");
			System.out.println ("Biaya Dasar         : Rp " + hargadasar);
			System.out.println ("Biaya Jarak         : Rp " + biayajarak);
			System.out.println ("Subtotal            : Rp " + subtotal);
			System.out.println ("Biaya Layanan       : Rp " + (int) biayalayanan);
			System.out.println ("Biaya Jenis Paket   : Rp " + biayajenis);
			System.out.println ("Total Sebelum Disc. : Rp " + (int)ttl);
			System.out.println ("Diskon              : Rp " + (int)diskon);
			System.out.println ("--------------------------------------");
			System.out.println ("Total Harga         : Rp " + (int) totalharga);
	}

	}


	