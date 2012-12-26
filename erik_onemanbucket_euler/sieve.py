#!/usr/bin/python

from bitarray import bitarray
import math

def gen(n):
    a = bitarray(n)
    a.setall(False)
    primes = []

    for i in range(2,n):
        if a[i]:
            continue
        for j in xrange(i,n,i):
            a[j] = True
        primes.append(i)
    return primes


def fact(n, primes):
    r = []
    for p in primes:
        while n%p == 0:
            n = n / p
            r.append(p)
    return r

#n = int(sys.argv[1])
#primes = gen(int(math.sqrt(n)))

#for p in primes[::-1]:
#    if n % p == 0:
#        print p
#        break
