// Java program to demonstrate an array to a method

public class ArraySum
 {
   // Driver method
	public static void main(String args[])
	{
		int arr[] = {11,22,33,44,55,66};

		// passing an array to  a  method 
		sum(arr);
	}

	public static void sum(int[] arr)
	{
		    // getting sum of array values
		    int sum = 0;
         for (int i = 0; i < arr.length; i++)
			sum += arr[i];

		System.out.println("sum of array values is : " + sum);
	}
}
