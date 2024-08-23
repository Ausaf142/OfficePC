package Java_Basic;

import java.util.Arrays;



public class ArraySorting
{
public static void main(String[] args) {
	int[] a = new int[5];
	String[] ab = {"apple","zebra","yak","jam"};
	a[0]=0;
	a[1]=650;
	a[2]=2;
	a[3]=3;
	a[4]=4;
 
	Arrays.toString(a);
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	Arrays.sort(ab);
	System.out.println(Arrays.toString(ab));
	
}
}
