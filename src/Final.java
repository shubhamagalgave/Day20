

public class Final
{
	static
	{
		System.out.println("running non-static-block1 of class Blocks3..");
	}
	public static void main(String[] args) {
		System.out.println("main() Starts");
		Final b = new Final();
		System.out.println("---------------------------------");
		Final b2 = new Final();
		System.out.println("main() ends");
	}
}
/**


*/