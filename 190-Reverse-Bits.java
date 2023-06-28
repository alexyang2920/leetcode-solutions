public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0, numberOfBits = 32;
        while(numberOfBits > 0) {
            res = (res << 1) | (n & 1);
            n = n >> 1;
            numberOfBits--;
        }
        return res;
    }
}
