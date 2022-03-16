package Examples;

import java.util.Arrays;

public class EX12 {
	public static void bubbleSort(int[]a) 
	{
		int j = 0;
		int tmp;
		boolean sorted =false;
		while(!sorted)
		{
			sorted=true;
			j++;
			for(int i =0;i<a.length-j;i++)
			{
			if(a[i]>a[i+1])
			{
				tmp=a[i];
				a[i]=a[i+1];
				a[i+1]=tmp;
				sorted=false;
			}	
			}
		}
	}
public static void main(String[] args) {
	int[]thisIsAnIntArray = {5,3,23,7,3,48,98,2,8,1,};
	bubbleSort(thisIsAnIntArray);
	System.out.println(Arrays.toString(thisIsAnIntArray));
}

}
