package MultiArray;

public class MultiplicationArray {
public static void main(String[] args) {
	int a[][] = {{1,2},{3,4}};
	int b[][] = {{2,3},{3,1}};
	int c[][] =new int [2][2];
	
	System.out.println("First Array");
	for (int i =0;i<a.length;i++) 
	{
		for(int j=0;j<a.length;j++) {
			
			System.out.print(a[i][j]+" ");
		}System.out.println();
	}
	    System.out.println();
	    System.out.println("Second Array");
	for(int i=0;i<b.length;i++) 
	{
		for(int j=0;j<b.length;j++)
		{
			System.out.print(b[i][j]+" ");
	    }
		System.out.println();
	}
	      System.out.println();
	      System.out.println("Multiplication of Array");
	      for(int i=0;i<c.length;i++)
	      {    
	    	  for(int j=0;j<c.length;j++)
	    	 {    
	    	  c[i][j]=0;
	    	  
	    	  for(int k=0;k<c.length;k++)      
	    	  {      
	    	     c[i][j]+=a[i][k]*b[k][j];      
	    	  } 
	    	      System.out.print(c[i][j]+" ");   
	    	 } 
	    	      System.out.println();   
	      }      
	}
	}


