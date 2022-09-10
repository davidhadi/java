package Matrix;

public class matrix {

    int[][] ar = new int[5][5];

    public void Cal(){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if (i == j){
                    ar[i][j] = 1 ;
                }
                else{
                    ar[i][j] = 0;
                }
            }
        }
    }
    public void Show(){
          System.out.println("Resultant Matrix is : ");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(" "+ ar[i][j]);
            }
            System.out.println("");
        }
    }
}
