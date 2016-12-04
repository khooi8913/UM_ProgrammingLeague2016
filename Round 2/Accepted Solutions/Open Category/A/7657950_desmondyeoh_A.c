out = []

while True:
    try:
        i = input()
        ary = [int(x) for x in i.split()]
        n = ary[0]
        ary = ary[1:]


        # get diff
        diff = []
        for a in range(len(ary) - 1):
            diff.append( abs(ary[a] - ary[a + 1]) )

        isJolly = True
        for j in range(n - 1):
            if j + 1 not in diff:
                isJolly = False
        out.append(isJolly)
    except:
        break

for o in out:
    if o:
        print("Jolly")
    else:
        print("Not jolly")