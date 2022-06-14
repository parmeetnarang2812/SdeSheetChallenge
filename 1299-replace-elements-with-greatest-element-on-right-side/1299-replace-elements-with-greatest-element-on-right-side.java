class Solution {
    public int[] replaceElements(int[] arr) {
        if(arr.length <=1 || arr == null) {
            return new int[]{-1};
        }
        int[] res = new int[arr.length];
        
        int max = -1;
        
        for(int i=arr.length-1; i>=0; i--) {
            if(arr[i] > max) {
                res[i] = max;
                max = arr[i];
            }
            else {
                res[i] = max;
            }
        }
        return res;
    }
}