#A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 99.
#
#Find the largest palindrome made from the product of two 3-digit numbers.


x = 0
for i in range(999,100,-1):
    for j in range(999,100,-1):
        s = str(i * j)
        if s[0:3] == s[:2:-1]:
            if i * j > x:
                x = i *j

print x
