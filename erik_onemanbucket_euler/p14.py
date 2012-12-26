import sys,math

visited = {}


def clen(i):
    r = 1
    while i != 1:
        r += 1
        i = collatz(i)
    return r

def collatz(n):
    if n == 1:
        return 1
    elif n%2==0:
        return n/2
    else:
        return 3*n+1

#l = i = 0
#while l < n:
#    i += 1
#    l = collatz(i)


def main():
    n = int(sys.argv[1])
    l = (0,0)
    for i in range(1,n+1):
        a = clen(i)
        if(a > l[1]):
            l = (i,a)
    print l


if __name__ == "__main__":
    sys.exit(main())
