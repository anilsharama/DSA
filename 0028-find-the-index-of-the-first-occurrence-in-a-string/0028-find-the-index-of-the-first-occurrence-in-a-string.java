class Solution {
    public int strStr(String haystack, String needle) {
            for(int i=0;i<haystack.length();i++){
                char ch = haystack.charAt(i);
                if(haystack.contains(needle)){
                    return haystack.indexOf(needle);

                }
            }
        return -1;
    }  
}