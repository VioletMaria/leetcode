class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.indexOf(needle, 0) > -1) {
            return haystack.indexOf(needle, 0);
        }
        if(needle.length() == 0){
            return 0;
        } 
        else {
            return -1;
        }
    }
}