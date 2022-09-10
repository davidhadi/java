public class Selection {

    private void selection(int[] ar){
        for(int i = 0; i<ar.length-1; i++){
            int min = ar[i];
            int index;
            for(int j = i+1; j<ar.length; j++){
                if(min>ar[j]){
                    min = ar[j];
                    index = j;
                    swap(ar, index, i);
                }
            }
        }
    }


    private void swap(int[] ar, int index, int i){
        int temp = ar[i];
        ar[i] = ar[index];
        ar[index] = temp;
    }

    private void show(int[] ar){
        for (int j : ar) {
            System.out.print(" " + j);
        }
        System.out.println();
    }
    public static void main(String[] args){

        Selection sl = new Selection();

        int[] ar = {4,10,8,11,2,9,20};

        sl.show(ar);
         sl.selection(ar);
         sl.show(ar);
    }
}
