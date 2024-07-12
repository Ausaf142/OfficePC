package Java_Basic;

import java.util.Arrays;


public class ArrayNum_Sorting {
public static void main(String[] args) {
	int[] arr = new int[] {5,7,1,9,1,8,6};
	System.out.println(Arrays.toString(arr));
	 Arrays.sort(arr);
	 System.out.println(Arrays.toString(arr));
	String[] str = new String[] {"i","e","q","s"};
	Arrays.sort(str);
	System.out.println(Arrays.toString(str));
}
}
