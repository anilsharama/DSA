class Solution {
    public String convertToTitle(int columnNumber) {
        String sum = "";
        String[] alpha = {
                "A", "B", "C", "D", "E", "F", "G", "H", "I",
                "J", "K", "L", "M", "N", "O", "P", "Q", "R",
                "S", "T", "U", "V", "W", "X", "Y", "Z" };

               while(columnNumber > 0){
                columnNumber--;
                int end = columnNumber%26;
                sum=alpha[end]+sum ;
                columnNumber=columnNumber/26;
                }
                return sum + "";
    }

}