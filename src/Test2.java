
public class Test2 {

	public static void main(String[] args) {
		Test2 test = new Test2();
		test.testMethod(0);
		test.testMethod(0f);
	}

	public int testMethod(int a){
		System.out.println("This is testMethod with parameter int");
		return 0;
	}

	public float testMethod(float a){
		System.out.println("This is testMethod with parameter float");
		return 0f;
	}
}
