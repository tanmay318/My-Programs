package MaxNum;

public class Max {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8,9};
	
	int maximum = a[0];
	for(int i=0;i<a.length;i++) 
	{
		if(a[i]>maximum)
			maximum=a[i];
	}
	System.out.println(maximum);
	System.out.println("Second Max Num:"+a[maximum-2]);
	System.out.println("Third Max Num:"+a[maximum-3]);
}
}
