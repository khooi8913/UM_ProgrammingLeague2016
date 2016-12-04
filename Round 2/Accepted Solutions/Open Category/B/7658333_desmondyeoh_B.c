out = []


ntc = int(input())


for tc in range(ntc):
    L = int(input())
    c = [int(x) for x in input().split()]
    count = 0
    for k in range(L - 1):
        for l in range(L - 1):
            if c[l] > c[l + 1]:
                tmp = c[l]
                c[l] = c[l+1]
                c[l+1] = tmp
                count += 1
    out.append(count)

for o in out:
    print("Optimal train swapping takes {} swaps.".format(o))