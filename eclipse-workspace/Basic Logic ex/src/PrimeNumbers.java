import java.util.Scanner;
public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc .nextInt();	
		int count = 0;
		for (int i = 2; i<num;i++) {
			if (num % i == 0)
				count++;
			break;
		}
		if (count == 0) {
			System.out.println(num+ " " +"is a Prime Number");
		}
		else {
			System.out.println(num+ " " +"is Not a Prime Number");
		}
		sc.close();
	}
}
