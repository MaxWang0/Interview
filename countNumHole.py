def countHole(num):
	hash= {}
	hash[0]=1
	hash[4]=1
	hash[6]=1
	hash[7]=1
	hash[8]=2
	hash[9]=1
	rem = 0
	div = 0;
	sum =0
	while(num>0):
		rem=num%10
		num = int(num/10)
		if rem in hash:
			sum+=hash[rem]
		
	return sum	
def main():
	print(countHole(123456))
	
main()
