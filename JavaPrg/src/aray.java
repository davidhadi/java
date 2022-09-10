
class aray {
    public static void main(String[] args){
        int target = 9;
        int[] num = {2,8,11,7};

            for (int i = 0; i <= 3; i++) {
                for (int j = 1; j <= 3; j++) {
                   if(num[i] + num[j] == target){
                       System.out.println("[" + i + "," + j + "]");
                   }
                }
            }
        }
}
