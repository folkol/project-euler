with open("p13.data") as fp:
    data = fp.readlines()



def carry(l):
    carry = 0
    for x in l[::-1]:
        if not x.isdigit():
            continue
        if int(x) + carry >=5:
            carry = 1
        else: 
            carry = 0
    return carry

s = 0
for l in data:
    s += int(l[0:10]) + carry(l[10:])

print s
