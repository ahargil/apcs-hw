public class MyStack {
    private String[] _stack;
    private int top;

    //constructor 1
    public MyStack() {
	_stack = new String[10];
	top = -1;
    }

    public MyStack(int n) {
	_stack = new String[n];
	top = -1;
    }
    //push 2
    public void push(String s) {
	if(top >= _stack.length-1) {
	    String[] stack2 = new String[(_stack.length)*2];
	    for(int x = 0; x <= top; x++) {
		stack2[x] = _stack[x];
	    }
	    stack2[top+1] = s;
	    _stack = stack2;
	}
	else {
	    if(this.isEmpty()) {
		_stack[0] = s;
	    }
	    else {
		_stack[top+1] = s;
	    }
	}
	top ++;
    }
    //pop
    public String pop() {
	String s = _stack[top];
	top --;
	return s;
    }
    //peek
    public String peek() {
	return _stack[top];
    }
    //isEmpty
    public boolean isEmpty() {
	return top == -1;
    }

    //toString
    public String toString() {
	String s = "[";
	for(int x = top; x > 0; x--) {
	    s += _stack[x] + ", ";
	}
	s += _stack[0] + "]";
	return s;
    }
}
