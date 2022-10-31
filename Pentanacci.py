def pentanacci(n,x,y,z,w,r):
	if n == 1:
		return 0
	c = x+y+z+w+r
	return (n-1,c,x,y,z,w)


if __name__ == "__main__":
	n = 7
	first = 0
	second = 1
	third = 1
	fourth = 2
	fifth = 3
	print(pentanacci(n,fifth,fourth,third,second,first))
