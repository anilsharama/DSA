class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int []arr = new int [n];

        k=k%n;

        int start = n-k;
        int d = 0;
        for(int i=start ;i<n;i++ ){
            arr[d] = nums[i];
            d++;
        }
        for(int j=0;j<start;j++){
            arr[d] = nums[j];
            d++;
        }

        for(int m =0;m<n;m++){
            nums[m]=arr[m];
        }

    }
}