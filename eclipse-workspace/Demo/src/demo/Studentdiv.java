package demo;

public class Studentdiv {
double a,b,c,d,e ;
double sum (double a, double b, double c, double d,double e)
{
	double add = (a+b+c+d+e);
	return add;
	}
double percentage () {
	Studentdiv obj = new Studentdiv();
	double sum =obj.sum(70, 50, 65, 85,70);
	double percentage = (sum/500)*100;
	if (percentage>=60) {
		System.out.println("Division A");
	}
	else if (percentage>= 50 && percentage<= 59)
	{
		System.out.println("Division B");
	}
	else if(percentage>= 50 && percentage<= 59) 
	{
		System.out.println("Division B");
		}
	else if (percentage>=40 && percentage<=49) 
	{
	System.out.println("Division C");	
	}
	else 
	{
		System.out.println("Fail");
	}
	return percentage;
}
	public static void main(String[] args) {
		Studentdiv obj1 = new Studentdiv();
		obj1.percentage();
	}
}
