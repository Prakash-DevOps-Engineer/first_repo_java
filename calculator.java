import java.util.Scanner;

class calculator{
	
	public static void main(String []arg){
		
		calculator oj = new calculator();
		Scanner sc = new Scanner(System.in);
		Scanner sa = new Scanner(System.in);
		
		int countadd=0;
		String name = "";
		
		do{
		System.out.println("\nModern Calulater ");
		System.out.println("\nI can do 2 digit calculation \n\n1.Add 2.Sub 3.Multi 4. Div 5. Modulus");
		System.out.print("\nEnter your choice : ");
		int choice = sc.nextInt();
		
		if(choice == 1){
			System.out.println("Enter two Data : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int f = oj.add(a,b);
			System.out.println("\nThe addition result is : "+f);
		}
		
		else if(choice == 2){
			System.out.println("Enter two Data : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int f = oj.sub(a,b);
			System.out.println("\nThe Subtration result is : "+f);
		}
		
		else if(choice == 3){
			System.out.println("Enter two Data : ");
			int a = sc.nextInt();
			float b = sc.nextFloat();
			float f = oj.mul(a,b);
			System.out.println("\nThe Multiplication result is : "+f);
		}
		
		else if(choice == 4){
			System.out.println("Enter two Data : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int f = oj.div(a,b);
			System.out.println("\nThe Division result is : "+f);
		}
		
		else if(choice == 5){
			System.out.println("Enter two Data : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int f = oj.mod(a,b);
			System.out.println("\nThe Division result is : "+f);
		}
		else{
			System.out.println("Choose between 1 to 5 only ");
		}
		System.out.println("Do you want to continue.?");
		name=sa.nextLine();
		
		}while(name.equals("yes"));
		System.out.println("Thank you");
	}
	
	public int add(int c, int d){
		int e=c+d;
		return e;
	}
	
	public int sub(int c, int d){
		int e=c-d;
		return e;
	}
	
	public float mul(int c, float d){
		float e=c*d;
		return e;
	}
	
	public int div(int c, int d){
		int e=c/d;
		return e;
	}
	
	public int mod(int c, int d){
		int e=c%d;
		return e;
	}
}