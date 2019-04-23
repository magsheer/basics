/*
    Number of 1 Bits
    
    Write a function that takes an unsigned integer and return the
    number of '1' bits it has (also known as the Hamming weight).
*/

public class HammingWeight {
    // you need to treat n as an unsigned value
    
    /*
        Brian Kernighan’s Algorithm converges sooner.
        n = n & (n - 1)
        O(log n)
    */
    public int ComputeHammingWeight(int n) {
        
        int count = 0;
        
        while(n>0) {
            count += n & 1;
            n = n >> 1;
        }
        
        return count;
    }
}