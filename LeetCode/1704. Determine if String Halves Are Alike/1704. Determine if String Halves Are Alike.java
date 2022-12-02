class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        String a = s.substring(0,s.length()/2);
        String b = s.substring(s.length()/2,s.length());
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
             cnt1++;
            }
            if(b.charAt(i)=='a'||b.charAt(i)=='e'||b.charAt(i)=='i'||b.charAt(i)=='o'||b.charAt(i)=='u'){
             cnt2++;
            }
        }
        if(cnt1==cnt2)
            return true;
        else
            return false;

    }
}