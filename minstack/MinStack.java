
class MinStack {

	List<Integer> stack = new LinkedList<Integer>();
	List<Integer> minstack = new LinkedList<Integer>();
	
	public void push(int x) {
       
		stack.add(x);
		
		if (minstack.isEmpty()) {
			minstack.add(x);	
		} else {
			if (x > minstack.get(minstack.size()-1)) {
				// System.out.println("adding to minstack - "+minstack.get(minstack.size()-1));
				minstack.add(minstack.get(minstack.size()-1));	
			} else {
				minstack.add(x);
			// 	System.out.println("adding to minstack - "+x);
				
			}
		}
		
    }

    public void pop() {
        stack.remove(stack.size()-1);
        minstack.remove(minstack.size()-1);
    }

    public int top() {
    	
        return stack.get(stack.size()-1);
    }

    public int getMin() {
    	//System.out.println("mst size:"+(minstack.size()-1));
    	return minstack.get(minstack.size()-1);
    }
}

