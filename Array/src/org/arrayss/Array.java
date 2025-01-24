package org.arrayss;

public class Array {
public static void main(String[] args) {
	int a[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Array craetion
	int sum=0;                                //sum of array
	for(int i=0;i<a.length;i++) {  
		sum=sum+a[i];
	}
	System.out.println("Sum Of Array Is :"+sum);
}
}
