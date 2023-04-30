
public class Final5 
{
		static int age = 25;
		double salary = 15000.57;

		void print() 
		{
			System.out.println("age: " + age);
			System.out.println("salary: " + salary);
		}
		public static void main(String[] args) {
			
			Final5 b1 = new Final5();
			b1.print();//
			b1.salary=45000.32;
			b1.print();//
			
		}
		
		static {
			age=35;
		}

	}


