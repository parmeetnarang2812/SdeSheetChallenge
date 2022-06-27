/*                          Missing and repeating numbers - MEDIUM(CodeStudio, GFG, InterviewBit)
 
You are given an array of size ‘N’. The elements of the array are in the range from 1 to ‘N’.
Ideally, the array should contain elements from 1 to ‘N’. But due to some miscalculations, there is a number R in the range [1, N] which appears in the array twice and another number M in the range [1, N] which is missing from the array.
Your task is to find the missing number (M) and the repeating number (R).

Follow Up
Can you do this in linear time and constant additional space? 
    Input Format
    The first line of input contains an integer T, the number of test cases.
    The first line of every test case contains an integer ‘N’ denoting the size of the array.
    The second line of every test case contains ‘N’ space-separated integers.
    Output Format:
    For every test case, print the missing number (M) and the repeating number (R) separated by a single space. 
    The output of each test case is printed in a separate line.

    You have to return a pair whose first element is the missing number ‘M’ and the second element is the repeating number ‘R’. 
    Constraints:
    1 <= T <= 10    
    2 <= N <= 5 * 10^4
    1 <= data <= N

    Where ‘T’ is the number of test cases, ‘N’ is the size of the array and ‘data’ denotes the value of the elements of the array. 
    Sample Input 1:
    1 
    5
    1 3 5 4 4
    Sample Output 1:
    2 4
    Explanation Of Sample Input 1:
    As we can clearly see, among all the numbers from 1 to 5, 2 is not present and 4 is occurring twice. 
    Thus, 2 and 4 are missing and repeating numbers respectively. 
    Sample Input 2:
    2
    10
    4 5 2 9 8 1 1 7 10 3
    7
    7 5 3 2 1 6 6 
    Sample Output 2:
    6 1 
    4 6 
*/

/*  // my solution 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int[] nums = new int[2];
        for(int i=0; i<arr.size(); i++) {
            int val = Math.abs(arr.get(i));
            if(arr.get(val)<0) {
                nums[0] = val;
            }
            arr.set(val, val*-1);
        }
        
        for(int i=0; i<arr.size(); i++) {
            if(arr.get(i)>0) {
                nums[1] = i+1;
            }
        }
        
        return nums;
    }
} */