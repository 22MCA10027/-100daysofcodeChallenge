// Java program to implement Insertion Sort
class InsertionSort
 {
	
	void sort(int arr[])
	{
		int n = arr.length;
		for (int i = 1; i < n; ++i) 
        {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key)
             {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	
	void printArray(int arr[]) //to print sorted array
	{
		int n = arr.length;
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
	}
}  

	class InsertionSorting 
    {

	   public static void main(String args[])
	 {
		

		InsertionSort obj = new InsertionSort();
        int arr[] = {22,55,33,88,66,99,11,44};
        System.out.println("Before sorting the elements are");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
		obj.sort(arr);
        System.out.println();
        System.out.println("sorted array is :");

		obj.printArray(arr);
	  }
    }
