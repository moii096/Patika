package newpackage;

import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		int bakiye=1000 ,input , miktar ;
		Scanner scan=new Scanner (System.in);
		System.out.println("Hosgeldiniz");
		System.out.println("Guncel bakiyeniz : "   + bakiye);

		while (bakiye >0 ) {
			System.out.println("1-) Para yatir ");
			System.out.println("2-) Para cek ");
			System.out.println("3-) Bakiye sorgula ");
			System.out.println("4-) Cikis yap  ");
			System.out.println("Lutfen yapmak istediginiz islemi seciniz  : ");
			input=scan.nextInt();
			
			if (input==1) {
				System.out.println("Yatirmak istediginiz miktari giriniz :");
				miktar=scan.nextInt();
				bakiye+=miktar ;	
			}else if (input==2) {
				System.out.println("Cekmek istediginiz miktari giriniz :");
				miktar=scan.nextInt();
				if (miktar>bakiye) {
                System.out.println("Yetersiz bakiye");
				}else {
				bakiye-=miktar ;
			}
		}else if (input==3) {
			System.out.println("Guncel bakiyeniz :"   +bakiye  +"TL");
			
		}else if (input==4) {
			System.out.println("Cikis yapiliyor tesekkurler");
			break;
		}else {
			System.out.println("Gecersiz islem girdiniz");
		}
			
		}
	}
}
