class BrowserHistory {
	Stack<String> stack;
	Stack<String> forwardStack;
    public BrowserHistory(String homepage) {
        stack = new Stack<>();
		forwardStack = new Stack<>();
		stack.push(homepage);
    }
    
    public void visit(String url) {
		stack.push(url);
		forwardStack.clear();
	}

	public String back(int steps) {
		while (steps > 0 && stack.size() > 1) {
			forwardStack.push(stack.pop());
			steps--;
		}
		return stack.peek();
	}

	public String forward(int steps) {
		while (steps > 0 && forwardStack.size() > 0) {
			stack.push(forwardStack.pop());
			steps--;
		}
		return stack.peek();
	}
}
/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */