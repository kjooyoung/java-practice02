package practice02;

public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		char[] c;
		String result = "";
		for(int i=0; i<str.length(); i++) {
			result+=str.substring(str.length()-(i+1), str.length()-i);
		}
		return result.toCharArray();
	}

	public static void printCharArray(char[] array){
		System.out.println(array);
	}
}
