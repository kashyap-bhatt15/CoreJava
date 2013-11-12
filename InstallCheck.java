
public class InstallCheck {

	public static void main(String [] args) {
		System.out.println ("Hello World!");
		
		InstallCheck t = new InstallCheck();
		t.test(5);
		
		staticTest(5);
	}
	
	public void test(int i) {
		System.out.println(i);
	}
	
	public static void staticTest(int i) {
		System.out.println("In static class");
	}
}