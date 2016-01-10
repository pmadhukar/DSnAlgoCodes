
public class CheckJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "Hello World!" );
        System.out.println(System.getProperty("java.vendor"));
        System.out.println(System.getProperty("java.vendor.url"));
        System.out.println(System.getProperty("java.version"));
        String vendor = System.getProperty("java.vm.vendor");
        System.out.println(vendor);
	}

}
