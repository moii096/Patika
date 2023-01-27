package newpackage;

import java.util.Scanner;

public class Asal {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int input ,i ;
        boolean asal =true ;
        
        do{
        	System.out.print("Lutfen pozitif bir sayi giriniz :");
        	input=scan.nextInt();
        }while (input<2) ;
        for (i=2 ; i<input ; i++ ) {
        	if (input%i ==0) {
        	asal=false ;
        	break ;
        	}
        }
        if (asal) {
        	System.out.print("Girilen sayi " + input + " asaldir.");
        	 
        
        	}else{
        		System.out.print("Girilen sayi " + input + " asal degildir.");
        }
	}

}
