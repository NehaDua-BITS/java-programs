import java.util.*;

public class CheckIfArraysEqual {
  
  public static void main(String[] args)
  {
    System.out.println("in main");
    int[] arr1 = new int[]{1,2,3,5,2,1,6};
    int[] arr2 = new int[]{6,1,2,5,2,1,7};
    
    System.out.println("Arrays are equal : " + new CheckIfArraysEqual().areEqual(arr1, arr2));
  }
  
  private boolean areEqual(int[] arr1, int[] arr2)
  {
    if (arr1 == null && arr2 == null)
      return true;
    
    if (arr1 == null || arr2 == null)
	return false;
	
    if (arr1.length != arr2.length)
	  return false;
	  
    HashMap<Integer, Integer> map = new HashMap<>();
    
    for (int i = 0; i < arr1.length; i++)
    {
	if (map.containsKey(arr1[i]))
	{
	  Integer count = map.get(arr1[i]);
	  map.put(arr1[i], count + 1);
	}
	else
	{
	  map.put(arr1[i], 1);
	}
    }
    
    System.out.println("Map for first array is : " + map.toString());
  
    for (int i = 0; i < arr2.length; i++)
    {
      if (!map.containsKey(arr2[i]))
	return false;      
      
      Integer count = map.get(arr2[i]);
      if (count <= 0)
	return false;
	
      map.put(arr2[i], count - 1);      
    }
    
    return true;
  }
  
}
