package ex1;

public class B {
public static void main(String[] args) {
	int[]array = {1,2};
	try {
		System.out.println("the 10th value of Array is:"+array[10]);
	}catch(Exception e) 
	{
		System.out.println("the error"+e);
	}
}
}
