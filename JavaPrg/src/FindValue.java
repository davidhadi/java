class FindValue {
    public static void main(String[] args){
        int[] array = {32,87,3,589,12,1076,12,2000,8,622,127};
        int SearchValue = 12;
        boolean found = false;
        System.out.println("Array length "+array.length);
        for (int j : array) {
            if (j == SearchValue) {
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Found "+SearchValue);
        }
        else{
            System.out.println(SearchValue+" is not in array");
        }
    }
}
