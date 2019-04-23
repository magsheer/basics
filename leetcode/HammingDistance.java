class HammingDistance {
    public int calcDist(int x, int y) {
        
        //Also lookup Brian Kernighans' Algorithm
        
        int result = x ^ y;
        int count = 0;
        
        while(result>0) {
            count += result & 1; //last bit & 1
            result >>= 1; //shift right
        }
        
        return count;
    }
}