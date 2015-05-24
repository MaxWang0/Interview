void maxsequence3(int a[], int len)    
{  
    int maxsum, maxhere;    
    maxsum = maxhere = a[0];   //初始化最大和为a[0]    
    int max_start = buf[0];  
    int max_end = buf[0];  
  
    int tmp = buf[0];  
  
    for (int i=1; i<len; i++) {  
        if (maxhere < 0){  
            maxhere = a[i];  //如果前面位置最大连续子序列和小于等于0，则以当前位置i结尾的最大连续子序列和为a[i]  
            tmp = a[i];  
        }  
        else{  
            maxhere += a[i]; //如果前面位置最大连续子序列和大于0，则以当前位置i结尾的最大连续子序列和为它们两者之和    
        }  
        if (maxhere > maxsum) {    
            maxsum = maxhere;  //更新最大连续子序列和  
            max_start = tmp;  
            max_end = a[i];  
        }    
    }  
  
    printf("%d %d %d\n", maxsum, max_start, max_end);  
} 
