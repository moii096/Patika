package newpackage;

import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String k_adi;
		String parola ;
		String newPass;
		System.out.print("Kullanici adi :");
		k_adi = scan.nextLine();
		System.out.print("Parola :");
		parola = scan.nextLine();
		if (k_adi.equals("Suleyman")&&parola.equals("1234")) {
			System.out.println("Basarili giris");
			
		}
		else {
			System.out.println("Giris basarisiz yeni sifre olusturulsun mu : \n 1-)Evet \n 2-)Hayir ");
			int deger ;
			deger=scan.nextInt();
			if (deger==1 ){
				System.out.println("Yeni sifre giriniz :");
				scan.nextLine();
				newPass=scan.nextLine();
				
				if (newPass.equals("1234")) {
					System.out.println("Sifre olusturulamadi ");
					
				}else {
					System.out.println("Sifre basari ile olusturuldu");
				}
				
			}else {
				System.out.println("Sifre degistirilmedi ");
			}
		 }
	}

}
