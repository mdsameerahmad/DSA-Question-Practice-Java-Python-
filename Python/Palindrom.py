num=-121221
dup=abs(num)
num=abs(num)
dup=num
rev=0
while(num>0):
    dig=num%10
    rev=rev*10+dig
    num=num//10
if(dup==rev):
    print("palindrome")
else:
    print("not a palindrome")