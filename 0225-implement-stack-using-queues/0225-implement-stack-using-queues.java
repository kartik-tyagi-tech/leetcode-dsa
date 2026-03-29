class MyStack {
Queue<Integer> q1= new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        q1.add(x);
        int size=q1.size();
        for(int i=0;i<size-1;i++){
            q1.add(q1.remove());
        }
    }
    
    public int pop() {
        return q1.remove();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}