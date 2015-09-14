class MyStack {
    
    Queue<Integer> queue1 = new LinkedList<Integer>();
    Queue<Integer> queue2 = new LinkedList<Integer>();

    // Push element x onto stack.
    public void push(int x) {
        
        if (queue1.size() == 0) {
          queue1.add(x);
        } else {
          while (queue1.size() > 0) {
            queue2.add(queue1.remove());
          }
          queue1.add(x);
          while (queue2.size() > 0) {
            queue1.add(queue2.remove());
          }
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        queue1.remove();
    }

    // Get the top element.
    public int top() {
        return queue1.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        if (queue1.size() == 0) {
            return true;
        } else {
            return false;    
        }
        
    }
}