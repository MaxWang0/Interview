/*Consider matrix/maze of nxm robot at one corner needs to move to diagonally opposite cell.
The robot can move only top or left.Write code that returns number of ways he can reach the target cell.*/
Public class Solution{
  public int numberOfPaths.java(int m, int n){
    int count[m][n];
    
    for(int i = 0; i < m i++){
      count[i][0] = 1;
    }
    
    for(int i = 0; i < n; i++){
      count[0][n] = 1;
    }
    
    for(int i = 0; i < m; i++){
      for(int j = 0; j < n; j++){
        count[i][j] = count[i-1][j] + count[i][j-1];
      }
    }
    
    return count[m-1][n-1];
  }
}
