public class mergeSort {

    private static void mergeSortA(int[] ar, int left, int right){
        if(left < right){
            int mid = (left + right)/2;
            mergeSortA(ar, left, mid);
            mergeSortA(ar, mid+1, right);
            merge(ar, left, mid, right);
        }
    }

    private static void merge(int[] ar, int left, int mid, int right){
        int[] b = new int[ar.length];
            int i = left;
            int j = mid+1;
            int k = 0;
            while (i <= mid && j <= right) {
                if (ar[i] < ar[j]) {
                    b[k++] = ar[i++];
                } else {
                    b[k++] = ar[j++];
                }
            }
            if (i > mid) {
                while (j <= right) {
                    b[k++] = ar[j++];
                }
            } else {
                while (i <= mid) {
                    b[k++] = ar[i++];
                }
            }
            System.arraycopy(b, 0, ar, 0, ar.length-1);
    }
    private static void printArray(int[] ar){
        System.out.println("Required Array is : ");
        for (int j : ar) {
            System.out.print(" " + j);
        }
    }

    public static void main(String[] args){
        int[] ar = {9, 7, 5, 6, 8, 12, 80, 10};

        mergeSortA(ar, 0, ar.length-1);
        printArray(ar);


    }
}
