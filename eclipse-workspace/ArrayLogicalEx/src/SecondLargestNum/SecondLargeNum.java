package SecondLargestNum;
import java.util.Arrays;
public class SecondLargeNum {
public static void main(String[] args) {
	int num[]= {1,23,45,67,78,9,10};
	int n =num.length;
	Arrays.sort(num);
	System.out.println("Second Largest Number:" +num[n-2]);
}
}
