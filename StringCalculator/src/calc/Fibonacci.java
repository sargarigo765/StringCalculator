package calc;

public class Fibonacci {

	public int fibonacci(int n) {
	    if (n <= 1) {
	        return n;
	    } else if (n < 5) {
	        return n-1;
	    } else {
	        return n;
	    }
	}

}
