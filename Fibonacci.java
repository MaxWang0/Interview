public class Solution {
       //recursive way
       public int Fib1(int n) {
              if( n == 1|n == 2 ) {
                return 1;
              }else{
                return Fib(n-1) + Fib(n-2);
                }
              }
       //unrecursive way
       public int Fib2(int n) {
              int nRet, nPp, nP = 1;
              nRet, nPp, nP = 1;
              
              if( n == 1|n == 2 ) {
                     return nRet;
              for(int i = 3; i < n; i++ ){
                     nRet = nP + nPp;
                     nPp = nP;
                     nP = nRet;
              }
              return nRet;
              }
       }
            }
          
       
       
