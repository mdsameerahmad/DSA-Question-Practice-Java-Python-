def max_area(height):
    left=0
    right=len(height)-1
    maxArea=0
    while left<right:
        curArea=min(height[left],height[right])*(right-left)
        maxArea=max(curArea,maxArea)
        if height[left]<height[right]:
            left +=1
        else:
            right-=1
    return maxArea        


if __name__ == "__main__":
    n=int(input("Enterr the size of the array :  "))
    print("Enter the lemets of te array with spaces : ")
    height=list(map(int ,input().split()))
    result = max_area(height)
    print("Max area is ",result)
