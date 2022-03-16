import java.util.Scanner;
public class Ex10 {
	//Normal Way
	//public static void main(String[] args) {
		//int a = 10;
		//char ch = 'j';
		//int sum= a + ch;
		//System.out.println(sum);
			//Dynamic Way
	char c;
	int a = 10;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Alphabet:");
		char c = sc.next().charAt(0);
		sc.close();
		int a = c + 10;
System.out.println("ASCII Value of Alphabet is:" +c+ " " +a);
	}
}


