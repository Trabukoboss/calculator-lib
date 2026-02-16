public class Calculator {
    public int add(int a, int b) {
	System.out.println("Adding numbers");
        return a + b;
        if (a < 0 || b < 0) {
           throw new IllegalArgumentException("Negative numbers not allowed");
        }
	return a + b;
    }
}
