public class Solution{
  public int maxSubArray(int[] A){
    int max = A[0];
    int sum_ = A[0];
    
    for(int i = 1; i < A.length; i++){
      sum_ = Math.max(A[i], A[i] + sum_ );
      max = Math.max(max, sum_);
    }
    
    return max;
    
  }
}
