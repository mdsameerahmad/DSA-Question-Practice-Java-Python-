arr=[2,7,11,15]
target=9
left=0
right=len(arr)-1
while(left<right):
    if arr[left]+arr[right]==target:
        print([left,right])
        break
    elif arr[left]+arr[right]<target:
        left+=1
    else:
        right-=1