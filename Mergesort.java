public class Solution{
  public mergesort(A[], start, end){
    
    int mid = (start+end)/2;
    mergesort(A[], start, mid);
    mergesort(A[], mid+1, end);
    merge(A[], mergesort(A[], start, mid), mergesort(A[], mid+1, end));
  }
  
  merge(A[], B[], C[]){
    b = B.length;
    c = C.length;
    if(b == 0| c != 0){
      for(int i = 0; i < c;  i++){
        A[i] = C[i];
      }
    }else if(c == 0| b != 0){
      for(int i = 0; i < c;  i++){
        A[i] = B[i];
      }
    }else{
      return;
    }
    int n = 0;
    int i = 0;
    int j = 0;
    while(n < b+c){
      if(i > b){
        A[n] = C[j];
        j++;
        n++;
      }
      if( j > c){
        A[n] = B[i];
        i++;
        n++;
      }
      if(B[i] > C[j]){
        A[n] = C[j];
        j++;
        n++;
      }else if(B[i] < C[j]){
        A[n] = B[i];
        i++;
        n++;
      }
    }
  }
}
