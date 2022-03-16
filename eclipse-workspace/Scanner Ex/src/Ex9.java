import java.util.Scanner;
public class Ex9 {
	// This is Dynamic Way of Program
	char a ;
	int value ;
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Alphabet to Get the ASCII Value ");
	char b = sc.next().charAt(0);
	//the above line convert the char to the ascii value.
	int value = b ;
	System.out.println("ASCII Value of :" +b+ " " +value );
	
	//This is Normal Way.You can Use both the way. 
	//public static void main(String[] args) {
		//int a = 'G';
		//System.out.println("Ascii Value of G is:" +a);
	}
}
 