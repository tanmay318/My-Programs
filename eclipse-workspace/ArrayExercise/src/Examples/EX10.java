package Examples;

public class EX10 {
public static void main(String[] args) {
	double d[]= {10,10.2,20.3,40.5,30.4};
	double result = 0;
	for(int i=0;i<d.length;i++)
	{
		result = result+d[i];
	}
	System.out.println("Average =" +result/d.length);
}
}
