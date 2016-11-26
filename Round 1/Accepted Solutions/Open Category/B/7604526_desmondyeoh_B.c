out = []

while True:
    u = input()
    if u == '0':
        break
    ages = [int(x) for x in input().split()]
    ages.sort()
    ages = [str(x) for x in ages]
    out.append(' '.join(ages))


# out
for o in out:
    print(o)