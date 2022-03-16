import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, div;
   Scanner sc = new Scanner (System.in);
   System.out.println("Enter First Number:");
   num1 = sc.nextInt();
   System.out.println("Enter Second Number:");
   num2 = sc.nextInt();
   sc.close();
   div =num1/num2;
   System.out.println("Division of two Numbers is:" +div);
	}

}
