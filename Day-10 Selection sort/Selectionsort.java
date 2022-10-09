// Java program to implement the selectionSort
class SelectionSort
{
    void sort(int arr[])
    {
        int n = arr.length; // To move the boundary of the unsorted subarray one by one
        for(int i=0;i<n-1;i++)
        {
            int min = i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min]) // For to swap the found element in the unsorted array
                {
                    min = j; //Element
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    void printarray(int arr[]) // To print the sorted array
    {
        int n = arr.length;
        for(int i=0;i<n;++i)
          System.out.print(arr[i]+" ");
    }
}
  class SelectionSorting
  {
    public static void main(String[] args)
    {
        SelectionSort obj = new SelectionSort();
        int arr[] = {66,22,11,44,33};
        System.out.println("Before sorting, the elements are");
        for(int i=0;i<arr.length;i++)
        {
           System.out.print(arr[i]+" ");
        }
        obj.sort(arr);
        System.out.println();
        System.out.println("Sorted Array is :" );
        obj.printarray(arr);
    }
  }
