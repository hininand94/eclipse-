package functions;

public class parameterreturntype {
	class Demo {
	    int add(int a, int b) {
	        return a + b;
	    }

	    public static void main(String[] args) {
	        Demo obj = new Demo();
	        int result = obj.add(10, 20);
	        System.out.println(result);
	    }
	}
}
