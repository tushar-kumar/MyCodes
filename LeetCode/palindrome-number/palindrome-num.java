class Solution {
    public boolean isPalindrome(int x) {
        int r = x;
        int rem, rev_x = 0;
        while(r>0){
            rem = r % 10;
            rev_x = rev_x * 10 + rem;
            r /= 10;
        }
        if(rev_x == x)
            return true;
        else
            return false;
    }
}