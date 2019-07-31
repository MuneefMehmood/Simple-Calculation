import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		
		Scanner scanner= new Scanner(System.in);
		
		
		System.out.println("This Is A Simple Calculator");
		System.out.println("Enter Your First Integer");
		
		int avalue= scanner.nextInt();
		
		System.out.println("Enter Your Second Integer");
		
		int bvalue = scanner.nextInt();
		
		
		
		int atotal = avalue + bvalue;
		int btotal = avalue - bvalue;
		int ctotal = avalue * bvalue;
		int dtotal = avalue / bvalue;
		 
		
		
		System.out.println("Addition, "+avalue+" + "+bvalue);
		System.out.println("Subtraction, "+avalue+" - "+bvalue);
		System.out.println("Multiplication, "+avalue+" * "+bvalue);
		System.out.println("Division, "+avalue+" / "+bvalue);
		
		
		System.out.println(avalue +" + "+bvalue +" = " +atotal);
		System.out.println(avalue +" - "+bvalue +" = " +btotal);
		System.out.println(avalue +" * "+bvalue +" = " +ctotal);
		System.out.println(avalue +" / "+bvalue +" = " +dtotal);
		
		
	}

}
