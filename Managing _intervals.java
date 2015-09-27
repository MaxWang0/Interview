public class Solution{
  public interval(input[][], output[]){
    n = input.length;
    m = 0
    for(int i = 0; i < n-2; i++){
      if(input[i][2] > input[i+1][1] && input[i][1] < input[i+1][2]){
        output[m++] = input[i][1];
        output[m++] = input[i+1][2];
      }
    }
  }
}
