
public class Final4 {

		static int age;
		double salary;
		
		static {
		        	age = 30;
	   	     }

		{
			salary = 45000.32;
		}
		public static void main(String[] args) 
		{
			
			System.out.println("age: " + Final4.age);
			System.out.println("---------------------------------");
			Final4 b1 = new Final4();
			System.out.println("salary: " + b1.salary);
			//System.out.println("salary: " + b1.age);
			
		}
	}
