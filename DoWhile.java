package newpackage;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int input , toplam=0 ;
		
		
		do{
			System.out.println("Sayi giriniz :" );
			input=scan.nextInt();
			if( input %2 ==0) {
				toplam+=input ;
				}
			}while(input>0) ;
		
			{System.out.println("Cift Sayilarin Toplami :" + toplam);
				
		
			
			}System.out.println("Negatif sayi girdiniz" );
	}

}
