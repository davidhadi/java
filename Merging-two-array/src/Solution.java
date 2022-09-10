class mergeArray {
    public void merge(int[] ar1, int[] ar2, int[] arr) {
        int i = 0, j = 0, k = 0;
        //double median;

        while (i < ar1.length && j < ar2.length) {
            if (ar1[i] <= ar2[j]) {
                arr[k] = ar1[i];
                k++;
                i++;
            } else {
                arr[k] = ar2[j];
                k++;
                j++;
            }
        }
        while (i < ar1.length) {
            arr[k] = ar1[i];
            k++;
            i++;
        }
        while (j < ar2.length) {
            arr[k] = ar2[j];
            k++;
            j++;
        }
    }
}

public class Solution {
    public static void main(String[] args){
        int[] ar1 = {4,8,9,22,52};
        int[] ar2 = {5,8,11,20,25,99};
        int l1 = ar1.length;
        int l2 = ar2.length;
        int[] arr = new int[l1+l2];

        mergeArray mg = new mergeArray();
        mg.merge(ar1, ar2, arr);

        System.out.println("Array is : ");
        for(int e : arr){
            System.out.print(" "+e);
        }
    }
}
