class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;

        for (int n : nums) {
            res ^= n;
        }

        return res;        
    }
}

What is XOR?
XOR (eXclusive OR) is a binary operation that compares two bits and outputs a result based on the following rules:

Same bits: 0 ^ 0 = 0, 1 ^ 1 = 0
Different bits: 0 ^ 1 = 1, 1 ^ 0 = 1
