def MissingNumber(arr):
    arr.sort()
    MissingDigit=1
    for i in range(len(arr)):
        if arr[i] != MissingDigit:
            return MissingDigit
        MissingDigit +=1
    return MissingDigit    


if __name__ == "__main__":
    n=int(input("Enter the size of the  array :-"))
    print("Enter the elemenst of the array with spaces :-")
    NewArray = list(map(int,input().split()))
    result = MissingNumber(NewArray)
    print("Missing elemenst of the arrays is : " ,result)
    