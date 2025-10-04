import re

def is_valid_palindrome(s):
    s = s.lower()
    s = re.sub(r'[^a-z0-9]', '', s)   # remove non-alphanumeric characters
    n = len(s)
    
    for i in range(n // 2):
        if s[i] != s[n - 1 - i]:
            return False
    return True


user_input = input("Enter a string: ")
if is_valid_palindrome(user_input):
    print("The string is a valid palindrome.")
else:
    print("The string is not a valid palindrome.")