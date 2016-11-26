def degree(d1, d2, direct):
    diff = abs(d1 - d2)
    if direct == 'cw':
        if d1 < d2:
            return 360 - diff
        elif d1 > d2:
            return diff
        else:
            return 0
    elif direct == 'ccw':
        if d1 < d2:
            return diff
        elif d1 > d2:
            return 360 - diff
        else:
            return 0


out = []

while True:
    u = input()
    if u == '0 0 0 0':
        break

    sum = 1080
    i1, i2, i3, i4 = [int(x) * 9 for x in u.split()]
    sum += degree(i1, i2, 'cw')
    sum += degree(i2, i3, 'ccw')
    sum += degree(i3, i4, 'cw')
    out.append(sum)


# out
for o in out:
    print(o)