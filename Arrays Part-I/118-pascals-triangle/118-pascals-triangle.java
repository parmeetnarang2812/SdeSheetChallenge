class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int i=0; i<numRows; i++) {
            List<Integer> ans = new ArrayList<>();
            int val = 1;
            ans.add(1);
            for(int j=0; j<i; j++) {
                val=(val *(i-j))/(j+1); //binomial
                ans.add(val);
            }
            res.add(ans);
        }
        return res;
    }
}