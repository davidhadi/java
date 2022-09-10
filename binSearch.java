import java.util.*;
public class binSearch{
public static void quickshort(int[] arr, int low, int high){
  int left = low;
  int right = high;
   
 	if(low>high){
            return;
        }

  int pivot = arr[high];

   while(left <= right){
      while(arr[left] < pivot){
       left++;
      }
      while(arr[right] > pivot){
       right--;
      }
     if (left <= right){
    int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
      left++;
      right--;
     }
   }

   quickshort(arr, low, right);
   quickshort(arr, left, high);

}

  public static void main(String[] args){
    binSearch bs = new binSearch();
      int arr[] = {52,12,42,53,95,26,86,75,42,10,12,35,62,14,82};
      int high = arr.length;
        bs.quickshort(arr, 0, high-1);
      System.out.println(" Sirted array is : ");
       
       for(int i = 0; i < arr.length; i++){
         System.out.print(" "+arr[i]);
       }
     
   
  }
}
