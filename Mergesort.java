public class Solution{
  public mergesort(A[], start, end){
    int mid = (start+end)/2;
    mergesort(A[], 0, mid);
    mergesort(A[], mid+1, end);
    merge(A[], mergesort(A[], 0, mid), mergesort(A[], mid+1, end));
  }
  
  merge()
}
