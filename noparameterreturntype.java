package functions;

public class noparameterreturntype {
	class Demo {
	    int getNumber() {
	        return 100;
	    }

	    public static void main(String[] args) {
	        Demo obj = new Demo();
	        int num = obj.getNumber();
	        System.out.println(num);
	    }
	}
}
