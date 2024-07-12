package Java_Basic;

//Java program to illustrate creating
//an array of objects

//Java Program to Multidimensional Array

//Driver Class
public class multiDimensional {
	// main function
	public static void main(String args[])
	{
		// declaring and initializing 2D array
		int arr[][]
			= { { 2, 7, 9 } };

		// printing 2D array
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 3; j++)
				System.out.print(arr[i][j] + " ");

			System.out.println();
		}
	}
}

