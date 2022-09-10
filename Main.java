class Quik{
public static void quicksort(int[] a, int low, int high){
      
      int left = low;
      int right = high;
       if(low>high){
            return;
        } 
      int pivot = a[high];
       while(left<=right){
          while(a[left]<pivot){
		left++;
           }
          while(a[right]>pivot){
		right--;
           }
      if(left<= right){
         int temp = a[left];
             a[left] = a[right];
             a[right] = temp;
             left++;
             right--;
         }
       }
// Put pivot where it belongs
     quicksort(a, low, right); // Sort left sub-array
     quicksort(a, left, high); // Sort right sub-array
 }
}
class Main{
    public static void main(String[] args){
      
        Quik Q = new Quik();
         int[] a = {5,4,9,8,3,1,10};
         int high = a.length;
         Q.quicksort(a, 0, high-1);
        
        System.out.println("Array After Sorted :");
        for(int i=0;i<a.length; i++) {
            System.out.print(a[i] + "\t");
        }
   }
}
         
    
