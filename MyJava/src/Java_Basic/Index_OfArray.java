package Java_Basic;

import java.util.Arrays;



public class Index_OfArray {
	public static void index(int[] array,int t) {
		String msg="error";
		int length_array =array.length;
		int i;
		if(array==null) {
			System.out.println("not found in the array");
//			return -1;
		}
		else if(array!=null) {
		for(i=0;i<length_array;i++) {
			if(array[i]==t) {
				System.out.println("the index of "+t+" is "+i);
				return ;
			}
		   }
		}
		
			
			System.out.println(msg);
		
	}
	public static void main(String[] args) {
		int[] arr = new int[] {5,8,9,5,8};
		index(arr, 8);
	}

}