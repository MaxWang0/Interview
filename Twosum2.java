public class Solution{
  public boolean twosum(A[], target){
    int n = A.length;
    if(n ==1 | n==0) {
      System.out.println("There is no pairs equal to target!");
      return false;
    }
    int a = 0;
    int b = A.length;
    while(a < b){
      A[a] + A[b]
    }
    
    
    for( int i = 0; i< n-1; i++){
     
     for(int j = i+1; j< n-1; j++){
       sum = A[i] + A[j];
       if(sum == target){
         System.out.println(A[i] + " and " + A[j])
         return true;
         
       }
     }
    }
  }
  
  public boolean twosum(A[], start, end, target){
    int mid = (start+end)/2;
    twosum
  }
}
