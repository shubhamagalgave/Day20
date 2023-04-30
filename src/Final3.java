
public class Final3 {

		
		/* static block or SIB*/
		static {		
			System.out.println("running static-block-1 of class Blocks2..");		
		}
		/* non-static block or IIB*/
		{
			System.out.println("running non-static-block-1 of class Blocks4..");
		}
		public static void main(String[] args) {
			System.out.println("main() Starts");
		    Final3 b1=new Final3();
			System.out.println("---------------------------------");
			Final3 b2=new Final3();
			System.out.println("main() ends");
		}
		/* static block or SIB*/
		static {		
			System.out.println("running static-block-2 of class Blocks2..");		
		}
		/* non-static block or IIB*/
		{
			System.out.println("running non-static-block-2 of class Blocks4..");
		}
	}
