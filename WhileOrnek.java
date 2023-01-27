package newpackage;

import java.util.Scanner;

public class WhileOrnek {

	public static void main(String[] args) {
	/*	Scanner scan=new Scanner(System.in);
		System.out.print("Bir deger giriniz : ");
		int i=scan.nextInt();
		int k = 1 ;
		
		while (i>0) {
			
			k=k*i ;
			i--;
			
	}System.out.println(k);*/
	
	/*	Scanner scan=new Scanner(System.in);
		System.out.print("Bir deger giriniz : ");
		double i=scan.nextDouble();
	double toplam = 0.0 ;
		
		while (i>0) {
			
			toplam+=1/i ;
			i--;
		
	}	System.out.println("Girilen sayilarin toplami " +toplam);*/
		
	/*	Scanner scan=new Scanner(System.in);
		
		System.out.print("Bir deger giriniz : ");
		int star =scan.nextInt();
		int i =1 ;
		
		while(i<=star) {
			int k=1 ;
			while (k<=i) {
				System.out.print("* ");
				k++;
				
			}System.out.println();
			i++;
		}*/
		Scanner scan=new Scanner(System.in);
		int sonuc=1;
		System.out.print("Bir deger giriniz : ");
		int a =scan.nextInt();
		System.out.print("Degerin ussunu  giriniz : ");
		int b=scan.nextInt();
		int i=1;
		while(i<=b) {
			i++;
			
			sonuc=sonuc*a ;
		}System.out.println("sonuc: "  + sonuc);
		}

}
