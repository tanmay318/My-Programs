import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number to Print Table");
		int n =sc.nextInt();
		System.out.println("Table of:"+n);
		for (int i=1;i<=10;i++)
			System.out.println(n+"x"+i+ "=" +n*i);
	}

}
