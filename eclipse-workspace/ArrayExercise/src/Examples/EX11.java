package Examples;

public class EX11 {
public static void main(String[] args) {
	int a[] = {1,2,3,4,5,6};
	int b[] = new int [6];
	System.out.println("Array:");
	System.out.print("[");
	for(int i =0; i<a.length;i++) 
	{
		System.out.print(" "+a[i]);
	}
	System.out.println("]");
	System.out.println("Array1");
	System.out.print("[");
	for(int j=0; j<a.length;j++) 
	{
		b[j]=a[j];
		System.out.print(" "+b[j]);
	}System.out.print("]");
}
}
