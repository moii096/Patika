package newpackage;

import java.util.Scanner;

public class WhileDongu {

	public static void main(String[] args) {
	/*	int i= 1 ;
		while (i<=100 ) {
			if (i %7==5) {
			System.out.println(i);
		}	i++;
		
		}*/
		/*Scanner scan=new Scanner(System.in);
		int i ;
		int toplam=0 ;
		
		while (true) {
			
			System.out.println("Bir sayi giriniz :");
			i=scan.nextInt();
			
			if(i<0) {
				System.out.println("Negatif bir sayi girdiniz");
				System.out.println("Girilen sayilarin toplami " + toplam);
				break;
			}
			if(i %2==1) {
				toplam=toplam+i;
				
			}
		}*/
		Scanner scan=new Scanner(System.in);
		System.out.print("Bir deger giriniz : ");
		int i=scan.nextInt();
		int k =2 ;
		
		while (k<=i) {
			System.out.println(k);
			k=k*2 ;
			
		}
		
	}

}
