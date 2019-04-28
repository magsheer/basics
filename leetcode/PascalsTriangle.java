/*
    Given a non-negative integer numRows,
    generate the first numRows of Pascal's triangle.

    In Pascal's triangle, each number is the sum of the
    two numbers directly above it.
*/

class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        
        //base cases
        if(numRows == 0)
            return ret;
        
        ret.add(new ArrayList<>());
        ret.get(0).add(1);
        
        if(numRows == 1)
            return ret;
        
        ret.add(new ArrayList<>());
        ret.get(1).add(1);
        ret.get(1).add(1);
        
        if(numRows == 2)
            return ret;
        
        for (int i = 3; i <= numRows; i++) {
            
            //add the first 1                
            ret.add(new ArrayList<>());
            ret.get(i-1).add(1);
            
            //get the previous list
            List<Integer> prev = ret.get(i-2);
            
            //compute the values inbetween
            int j = 1;
            while(j <= i-2) {
                ret.get(i-1).add(prev.get(j-1)+prev.get(j));
                j++;
            }
            
            //add the last 1
            ret.get(i-1).add(1);
                
        }
        
        return ret;
    }
}