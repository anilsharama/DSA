class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int n = num1.length()-1;
        int m = num2.length()-1;
        String num  = "";
        int curry = 0;

        while(n >= 0 || m >= 0 || curry > 0){
            int sum = curry;

            if(n >=0){
                sum+=num1.charAt(n)-'0';
                n--;
            }
            if(m>=0){
                sum+=num2.charAt(m)-'0';
                m--;
            }
            res.append(sum%10);
            curry = sum/10;


        }
        return res.reverse().toString();
    }
}