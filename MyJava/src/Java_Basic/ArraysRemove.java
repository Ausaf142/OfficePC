package Java_Basic;

import java.util.Arrays;

public class ArraysRemove {
	public static void main(String[] args) {
		int[] arr = {5,7,9,4,8};
	int removeind=1;//index of 7 is 1
	for(int i=removeind;i<arr.length-1;i++) {
		arr[i]=arr[i+1];
	}
	int[] newArr=Arrays.copyOf(arr, arr.length-1);
	System.out.println(Arrays.toString(newArr));
	}
}
