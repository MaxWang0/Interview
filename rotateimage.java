public class Solution{
  public void rotateimage(int[][] matrix){
    int n = matrix.length;
    
    if(n<=1){
      return;
    }
    
    for(int i = 0; i < (1+n)/2; i++){
      for(int j = 0; j < n/2; j++ ){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[n-j-1][i];
        matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
        matrix[n-i-1][n-j-1] = matrix[j][n-i-1];
        matrix[j][n-i-1] = temp;
      }
    }
    return;
  }
}
