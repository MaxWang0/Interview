FIB <- c()
fib <- function(EP){
  i = 1
  diff = 2
  n = 1
  m = 1
  while(diff >= EP){
    if(i == 1){
      FIB <- c(FIB, n)
   }else if(i == 2){
    FIB <- c(FIB, m)
   }else{
   FIB <- c(FIB, n + m)
   n = FIB[i-1]
   m = FIB[i]
   diff = FIB[i]/FIB[i-1] - FIB[i-1]/FIB[i-2]
   }
   i = i+1
  }
  k = i
  GR = mean(c(FIB[i-1]/FIB[i-2],  FIB[i-2]/FIB[i-3]))
  return (c(k, GR))
}

fib <- function(EP){
  i = 1
  diff = 2
  while(diff >= EP){
    EP = EP + 1
  }
  return (EP)
}


FIB <- c()
fib <- function(k, x){
  for (i in 1:k){
    if(i == 1){
      FIB <- c(FIB, n)
    }else if(i == 2){
    FIB <- c(FIB, m)
   }else{
   FIB <- c(FIB, n + m)
   n = FIB[i-1]
   m = FIB[i]
   }
  }
  temp = c()
  for( i in 1: x){
     FIB <- c(FIB, n + m)
     n = FIB[k+i-1]
     m = FIB[k+i]

     temp = c(temp, FIB[k+i]/FIB[k+i-1])
  }

  GRmean = mean(FIB[k]/FIB[k-1], as.numeric(as.vector(temp)))

  TGR = rnorm(1, mean = GRmean, sd = sd(c(FIB[k]/FIB[k-1], as.numeric(as.vector(temp)))))

  return (temp)
}

FIB <- c()
fib <- function(k){
  for (i in 1:k){
    if(i == 1){
      FIB <- c(FIB, n)
    }else if(i == 2){
    FIB <- c(FIB, m)
   }else{
   FIB <- c(FIB, n + m)
   n = FIB[i-1]
   m = FIB[i]
   }
  }

 return ( FIB[k]/FIB[k-1])
}


a = FIB(2)
b = FIB(3)
c = FIB(4)
print(a, b, c)

