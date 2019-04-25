class MinStack {
    
    Stack<Integer> s = new Stack<Integer>();
    int minS;

    //  initialize your data structure here. 
    
    public MinStack() {
        minS = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        if(x <= minS) {
            s.push(minS); //tracking previous min
            minS = x;
        } 
        s.push(x);
    }
    
    public void pop() {
        int topElement = s.pop();
        if(topElement == minS)
            minS = s.pop(); //previous min that we tracked
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return minS;
    }
    
    
    /*
        Use another stack to keep track of the minimum element
    */
    
    /*
    Stack<Integer> s = new Stack<Integer>();
    Stack<Integer> minS = new Stack<Integer>();

    //  initialize your data structure here. 
    
    
    public MinStack() {
        
    }
    
    public void push(int x) {
        s.push(x);
        
        if(!minS.empty() && x > minS.peek())
            minS.push(minS.peek());
        else 
            minS.push(x);
        
    }
    
    public void pop() {
        if(!s.empty()) {
            minS.pop();
            s.pop();
        }
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return minS.peek();
    }
    
    */
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */