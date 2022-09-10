public class Solution {


    private void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        System.arraycopy(a, 0, l, 0, mid);
        if (n - mid >= 0) {
            System.arraycopy(a, mid, r, 0, n - mid);
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);
        merge(a, l, r, mid, n - mid);
    }
    private void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }


    private void show(int[] ar){
        for (int j : ar) {
            System.out.print(" " + j);
        }
        System.out.println();
    }
    public static void main(String[] args){

        Solution sl = new Solution();

        int[] ar = {4,10,8,11,2,9,20};

        sl.show(ar);
        sl.mergeSort(ar, ar.length);
        sl.show(ar);
    }
}

