package Java_Basic;

public class Sum_Arrays {
public static void main(String[] args) {
	int[] arr = new int[] {5,8,9,5,8};
	int sum=0;
//	for(int i =0;i<5;i++) {
//		 sum = sum+arr[i];
//	}
	
	for(int j:arr) {
		sum=sum+j;
	}
	
	
	
	
	System.out.println("The sum of array is :" +sum);
}
}
