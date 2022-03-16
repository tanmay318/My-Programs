package MultiArray;
import java.util.Scanner;

public class TwoD {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a[][]=new int[2][2];
	int sum=0;
		/*a[0][0]=20;
		a[0][1]=30;
		a[1][0]=40;
		a[1][1]=50;*/
		System.out.println(" Enter Elements of 2D Array:");
			for(int i =0; i<a.length;i++) 
			{
				for(int j=0;j<a[i].length;j++)
				{
					a[i][j]=sc.nextInt();
					sum=a[i][j]+sum;
					System.out.println(+a[i][j]);
				}
			}
			System.out.println("Sum of 2D Array is:"+sum);
			sc.close();
}
}

