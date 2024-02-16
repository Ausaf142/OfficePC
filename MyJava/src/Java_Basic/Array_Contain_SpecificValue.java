package Java_Basic;


public class Array_Contain_SpecificValue {
public static boolean item(int[] ar,int item) {
	for(int b :ar) {
		if(item==b) {
			System.out.println("yes matched " +b);
			return true;
		}
	}
	System.out.println("not matched");
	return true;
}
	public static void main(String[] args) {
		int[] arr = {5,7,9,4,8,};
		item(arr,0);
	}
}

