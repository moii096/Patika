package newpackage;

public class OverLoad {

	static int add( int a , int b ) {
		System.out.println("1. fonksiyon :");
		return a + b;	
	
	}
	static int add( int a , int b , int c ) {
		System.out.println("2. fonksiyon :");
		return  a + b + c;	
		}
	static double add( int a , int b , double c ) {
		System.out.println("3. fonksiyon :");
		return  a + b + c;	
		}
	
	public static void main(String[] args) {
		System.out.println(add(1,5,10));
		System.out.println(add(8,7,10.0));
		System.out.println(add(8,7	));
	}

}
