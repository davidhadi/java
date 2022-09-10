public class Solution {
    public static int[] b;
    private static void mergeSort(int[] a, int left, int right){
        if(left < right){
            int mid = (left + right)/2;
            mergeSort(a, left, mid);
            mergeSort(a, mid+1, right);
            merge(a, left, mid+1, right);
        }
    }

    private static void merge(int[] a, int left, int mid, int right){
        int k = 0;
        while(left <= mid && (mid+1) <= right) {
            if (a[left] < a[mid]) {
                b[k++] = a[left++];
            } else {
                b[k++] = a[mid++];
            }
        }
        if(left > mid){
            while(mid <= right) {
                b[k++] = a[mid++];
            }
        }
        else{
            while(left <= mid){
                b[k++] = a[left++];
            }
        }
        System.arraycopy(b, 0, a, 0, a.length);
    }

    public static void main(String[] args){
        int[] ar = {9, 7, 5, 6, 8, 12, 80, 10};
        mergeSort(ar, 0, ar.length-1);

        System.out.println("Required Array is : ");
        for (int j : ar) {
            System.out.print(" " + j);
        }

    }
}
