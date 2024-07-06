## Question 1
You are given two strings A and B consisting of lowercase latin letters, i.e. (a, b, c, .., z).

You can perform any number of operations (possibly zero) on A and B and in one operation you can:

• Remove the first character from A or B.

• Remove the last character from A or B.

Find the minimum number of operations that you have to perform to make A equal to B.

Note:

• It is possible that A or B becomes empty while performing operations.

• It is given that two empty strings are equal.

Input Format

The first line contains a string, A, denoting the given string.

The next line contains a string, B, denoting the given string.

Case 1

Input:

abaca
ababa

Output: 4


Case 2

Input:

abcee

efgee

Output: 6

Explanation:

Here, A "abcee", B= "efgee"

We can remove the first 3 characters from both strings A and B, so that they both become equal to "ee".

Hence, the operations performed is equal to 6.

Case 3

Input:

ijhk

oujpopp

Output:

9

Explanation:

Here, A "ijhk", B "oujpopp"

It can be found that the minimum number of operations required to make A and B equal are 9.

## Code
```
def min_operations_to_make_equal(X, Y):
    m = len(X)
    n = len(Y)
    
    # Create a DP table to store lengths of longest common subsequence.
    LCSuff = [[0 for k in range(n+1)] for l in range(m+1)]

    # To store the length of
    # longest common substring
    result = 0

    # Following steps to build
    # LCSuff[m+1][n+1] in bottom up fashion
    for i in range(m + 1):
        for j in range(n + 1):
            if (i == 0 or j == 0):
                LCSuff[i][j] = 0
            elif (X[i-1] == Y[j-1]):
                LCSuff[i][j] = LCSuff[i-1][j-1] + 1
                result = max(result, LCSuff[i][j])
            else:
                LCSuff[i][j] = 0
    return (m-result)+(n-result)

# Test cases
print(min_operations_to_make_equal("abaca", "ababa"))  # Output: 4
print(min_operations_to_make_equal("abcee", "efgee"))  # Output: 6
print(min_operations_to_make_equal("ijhk", "oujpopp"))  # Output: 9

```
