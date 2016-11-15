import sys
t = int(input())

for i in range(t):
	n = input().split()
	n1 = int(n[0])
	n2 = int(n[1])
	if(n1>n2):
		print('>')
	elif(n1<n2):
		print('<')
	else:
		print('=')