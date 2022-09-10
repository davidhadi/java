public class Main {
// =========================== Quick sort Algorithm  ===============================
    private static void Quicksort(int[] arr, int low, int high){
         int left = low;
         int right = high;
        if(low>high){
            return;
        }
        int pivot = arr[high];

        while(left<=right) {
            while(arr[left] < pivot){
                left++;
            }
            while(arr[right] > pivot){
                right--;
            }
            if(left <= right){
                Swap(arr, left, right);
                left++;
                right--;
            }
        }
            Quicksort(arr, low, right);
            Quicksort(arr, left, high);
 }
// ==================== Quick sort algoritm is apply for string =========================
    private static void QuicksortStr(String[] str, int low, int high){
        int left = low;
        int right = high;
        if(low>high){
            return;
        }
        String pivot = str[high];

        while(left<=right){
            while(str[left].compareTo(pivot)<0){
                left++;
            }
            while(str[right].compareTo(pivot)>0){
                right--;
            }
            if(left<=right){
                Swap(str, left, right);
                left++;
                right--;
            }
        }
            QuicksortStr(str, low, right);
            QuicksortStr(str, left, high);
    }
// ============================== Bubble sort algorithm  =================================
/*    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    //swap elements
                    Swap(arr, i, j);
                }
            }
        }
    }  */
// ============================== Selection sort algorithm ===================================
 /*   protected static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++){
            int id = i;
            for (int j = i+1; j < arr.length; j++)
                if (arr[j] < arr[id])

            Swap(arr, id, i);
            id = j;
        }
    } */
// =============================== Insertion sort algorithm ====================================
  /*  static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; ++i) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j + 1] = temp;
        }
    }  */
// ============================== Code for Swaping String =======================================
    public static void Swap(String[] str, int left, int right) {
        String temp = str[left];
        str[left] = str[right];
        str[right] = temp;
    }
// =============================== Code for Swaping integer ===================================
    public static void Swap(int[] arr, int left, int right) {
     int temp = arr[left];
     arr[left] = arr[right];
     arr[right] = temp;
  }
// ================================= Binary search algorithm =====================================
    protected static int Binsearch(int[] arr, int left, int right, int x){
        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x){
                return mid;
            }

            if (arr[mid] > x){
                return Binsearch(arr, left, mid - 1, x);
            }
             return Binsearch(arr, mid + 1, right, x);
        }
        return -1;
    }
// ============================== Code for printing seperate line  ==================================
     public static void printline(){
         System.out.println();
        for(int i=0; i<50; i++){
            System.out.print("*");
        }
        System.out.println();
     }
     public static void main(String[] args){
        int[] arr = {1,50,30,10,60,80,45,95,46,58,56,99,52,74,100,106,38,9};
        String[] str = {"Madras","Delhi","Ahmadabad","Calcutta","Bombay","Chandigadh","Punjab","Aligardh",
        "Ajmer","Banglore","Banaras"};


        System.out.println("Array Before Sorted :");
         for (int j : arr) {
             System.out.print(j + "\t");
         }
        printline();
      System.out.println("String Array Before Sorted :");
      for(String j : str){
          System.out.print(j +"\t");
      }
      printline();
        Quicksort(arr, 0, arr.length-1);
        QuicksortStr(str, 0, str.length-1);
        //insertionSort(arr);
        //selectionSort(arr);
        //bubbleSort(arr);
// ============================= for the printing of Interger Array =======================
      System.out.println("Array After Sorted :");
        for(int j : arr) {
            System.out.print(j + "\t");
        }
// ========================= for the printing of String Array ===============================
      printline();
      System.out.println("String Array After Sorted :");
        for(String s : str) {
            System.out.print(s + "\t");
        }
// =================== For Binary Search operation , Searching an element =======================
            printline();
             int x =60;
            System.out.println("Element search for : "+x);

            Binsearch(arr, 0, arr.length-1, x);
            int result = Binsearch(arr, 0, arr.length - 1, x);
            if (result == -1)
                System.out.println("Element not present");
            else
                System.out.println("Element found at index:  " + result);
            printline();
    }
}
