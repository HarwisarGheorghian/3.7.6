/**
 * Avticity 3.7.6
 */
import java.util.ArrayList;

public class SortingAlgorithms
{
  /**
   * Perform a selection sort an ArrayList of integers
   * @param intList an ArrayList of integers
   * @return intList sorted from smallest to largest
   */
  public static ArrayList<Integer> selectionSortInt(ArrayList<Integer> intList)
  {
    for(int i = 0; i < intList.size() - 1; i++){
      //Set the smallest index at the current index
      int minIndex = i;

      //Search for a smaller index in the rest of the array besides the current one
      for(int j = minIndex; j < intList.size(); j++){
        if(intList.get(j) < intList.get(minIndex)){
          minIndex = j;
        }
      }

      int temp = intList.get(i);
      int smallest = intList.get(minIndex);
      intList.set(i, smallest);
      intList.set(minIndex, temp);

    }
    
    return intList;
  }

  /**
   * Perform an insertion sort an ArrayList of integers
   * @param intList an ArrayList of integers
   * @return intList sorted from smallest to largest
   */
  public static ArrayList<Integer> insertionSortInt(ArrayList<Integer> intList)
  {
    for (int i = 1; i < intList.size(); i++) 
    {
      
      int unsortedValue = intList.get(i); 
      int sortedIndex = i - 1; 
      
      while (sortedIndex >= 0)  
      {
        int sortedValue = intList.get(sortedIndex);
        
        if (sortedValue > unsortedValue) 
        {
          intList.set(sortedIndex + 1, sortedValue);
          intList.set(sortedIndex, unsortedValue); 
        }
        sortedIndex--;
      }
    }

    return intList;
  }

  /**
   * Perform a selection sort an ArrayList of doubles
   * @param doubleList an ArrayList of doubles
   * @return doubleList sorted from smallest to largest
   */ 
  public static ArrayList<Double> selectionSortDouble(ArrayList<Double> doubleList)
  {
    for(int i = 0; i < doubleList.size() - 1; i++){
      //Set the smallest index at the current index
      int minIndex = i;

      //Search for a smaller index in the rest of the array besides the current one
      for(int j = minIndex; j < doubleList.size(); j++){
        if(doubleList.get(j) < doubleList.get(minIndex)){
          minIndex = j;
        }
      }

      double temp = doubleList.get(i);
      double smallest = doubleList.get(minIndex);
      doubleList.set(i, smallest);
      doubleList.set(minIndex, temp);

    }
    
    return doubleList;
  }

  /**
   * Perform an insertion sort an ArrayList of doubles
   * @param doubleList an ArrayList of doubles
   * @return doubleList sorted from smallest to largest
   */
  public static ArrayList<Double> insertionSortDouble(ArrayList<Double> doubleList)
  {
    for (int i = 1; i < doubleList.size(); i++) 
    {
      
      double unsortedValue = doubleList.get(i); 
      int sortedIndex = i - 1; 
      
      while (sortedIndex >= 0)  
      {
        double sortedValue = doubleList.get(sortedIndex);
        
        if (sortedValue > unsortedValue) 
        {
          doubleList.set(sortedIndex + 1, sortedValue);
          doubleList.set(sortedIndex, unsortedValue); 
        }
        sortedIndex--;
      }
    }
    
    return doubleList;
  }

}