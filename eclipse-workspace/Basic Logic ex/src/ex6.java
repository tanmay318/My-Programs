
public class ex6 {
	public static void main(String[] args) {
		
	
	System.out.println("Odd Numbers From 500 to 100 Which are Divisible by 5:");
	for (int i =500; i>=100; i--) 
	{
		if (i % 2!=0)
			if(i % 5==0)
			System.out.print(i + " ");
	}
}
}