import java.util.Scanner;
public class Sumofdigits {
	public static void main(String[] args) {
		int num,rem,sum=0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Number");
		 num = sc.nextInt();
		 sc.close();
		 while(num>0)
		 { rem =  num % 10;
		 		sum = sum + rem;
		 		num = num/10;	
		 		}		 		
		 System.out.println("Sum of Digits is:"+sum);
	}
	}	

