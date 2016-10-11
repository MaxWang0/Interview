def fact(num):
	res = 0
	i = 5
	
	while(int(num/i)>=1):
		res = res+ num/i
		i= i*5
		
	return res	
def main():
	print(fact(10))
	
main()
