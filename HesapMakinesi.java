package newpackage;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		double a,b ;
		int c;
		
		System.out.println("ilk sayiyi giriniz:");
		a=scan.nextDouble();
	
		System.out.println("ikinci sayiyi giriniz:");
        b=scan.nextDouble();
        
		System.out.println("Yapmak istediginiz islemi seciniz:");
		
		System.out.println("1:Toplama\n2: Cikarma\n3 : Carpma\n4: Bolme");
		c=scan.nextInt();
		
	   if(c==1){
		   System.out.println("Toplam=" + (a+b));  
		 }  else if(c==2){
			 System.out.println("Fark=" + (a-b)); 
			 
		 }
		 else if(c==3){
			 System.out.println("Carpim=" + (a*b)); }
		 else if(c==4){
			 System.out.println("Bolum =" + (a/b)); 
		 }
		
	}
	

}
