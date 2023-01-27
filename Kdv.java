package newpackage;

import java.util.Scanner;

public class Kdv {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double fiyat ,kdv ,kdvliFiyat ; 
		
		System.out.println("Urunun fiyatini giriniz :"); 
		
		fiyat=input.nextDouble();
		
		kdv =fiyat*0.18 ;
		
		kdvliFiyat = fiyat + kdv ;
		
		System.out.println("Urunun fiyati :" + fiyat); 
		
		System.out.println("Urunun kdv bedeli :" +kdv); 	
		
		System.out.println("Urunun kdvli fiyati :" + kdvliFiyat); 

	}

}
