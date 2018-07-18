import java.util.*;

public class MergeSort
{
  private int[] arr;
  
  public MergeSort(int[] arr)
  {
    this.arr = arr;
  }
  
  public static void main(String[] args)
  {
    int[] arr = new int[]{4,2,-4,6,1,10,34,12,13,-2,10,5, 0};
    MergeSort mergeSort = new MergeSort(arr);
    mergeSort.sort();
    System.out.println("Sorted array is : " + Arrays.toString(arr));
  }
  
  private void sort()
  {
    System.out.println("Unsorted array is : " + Arrays.toString(arr));
    mergeSort(arr, 0, arr.length - 1);
  }
  
  private void mergeSort(int[] arr, int l, int h)
  {
    if (l == h)
      return;
      
    int p = (l + h) / 2;
    
    mergeSort(arr, l, p);
    mergeSort(arr, p+1, h);
    merge(arr, l, p, h);
  }
  
  private void merge(int[] arr, int l, int p, int h)
  {
    int low1 = l, low2 = p+1;
    int[] result = new int[h-l+1];
    int k = 0;
    
    while ((low1 <= p) && (low2 <= h))
    {
      if (arr[low1] <= arr[low2])
	result[k++] = arr[low1++];
      else
	result[k++] = arr[low2++];      
    }
    
    while (low1 <= p)
      result[k++] = arr[low1++];
      
    while (low2 <= h)
      result[k++] = arr[low2++];
      
    for (int i = 0, j = l; i < k; j++, i++)
	arr[j] = result[i];	
  }
  
}
