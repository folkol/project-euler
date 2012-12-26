import sieve
from sets import Set
import sys,math


n = int(sys.argv[1])
#primes = sieve.gen(math.sqrt(n))

def fact(n):
    a = []
    for i in range(1,int(math.ceil(math.sqrt(n)))):
        if n%i == 0:
            a.append(i)
            a.append(n/i)
    return a
                
tri = 1;
i = 1
while True:
    a = fact(tri)
    if len(a) > n:
        print a
        print tri
        break
    i+=1
    tri += i
