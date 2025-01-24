package org.arrayss;

public class Average {
	public static void main(String[] args) {
	
		int	a[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum=0;
		double Average=0;
		for(int i=0;i<a.length;i++) {  
			sum=sum+a[i];
			 
		}
		Average=sum/a.length;
		System.out.println("Average Of Array Is :"+Average);
		System.out.println("Average Of Array Is :"+sum);

	}
			

}