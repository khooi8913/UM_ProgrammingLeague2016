def main():
	while(True):
		try:
			line = input().split()
		except:
			break
		n = int(line[0])
		seq = [False]*(n-1)
		status = True
		try:
			for i in range(n-1):
				seq[abs(int(line[i+1])-int(line[i+2]))-1] = True
			
			for s in seq:
				if(s is False):
					status = False
		except IndexError:
			status = False

		if(status):
			print('Jolly')
		else:
			print('Not jolly')

main()