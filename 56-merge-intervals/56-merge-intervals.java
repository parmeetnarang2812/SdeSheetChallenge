class Solution {
    public int[][] merge(int[][] intervals) {
        
        if(intervals.length==0 || intervals==null) {
            return intervals;
        }

        //sort
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

        List<int[]> res = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        
        //loop over every interval and check if it merges
        for(int[] i : intervals) {
            if(i[0]<=end) {
                end = Math.max(end, i[1]);  //deciding the end of interval after merge
            }
            else {
                res.add(new int[]{start, end}); //if it doesn't merge add the current pair to result 
                start = i[0];   //new interval pair
                end = i[1];
            }
        }
        res.add(new int[]{start, end}); //last pair is added to result
        return res.toArray(new int[0][]);   //converting AL to array
    }
}