class MinStack {

    //Using two stacks to store the values.
    Stack<Integer> pushStack = new Stack<>(); //Stack to store all the values pushed
    Stack<Integer> minStack = new Stack<>();  //Stack to Store all the minimum values
    

    public MinStack() {}
    

    public void push(int val) {

        pushStack.push(val);
        if(minStack.isEmpty() || pushStack.peek() <= minStack.peek())
            minStack.push(val);
    }
    
    public void pop() {
        if(pushStack.peek().equals(minStack.peek()))
        {
            minStack.pop();
        }
        pushStack.pop();
    }
    public int top() {
        return pushStack.peek();
    }
    public int getMin() {
        return minStack.peek();
    }
}
