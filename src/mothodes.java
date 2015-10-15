import java.util.Scanner;
public class mothodes {
	
public static void interest()
{
Scanner input=new Scanner(System.in);
	 double total ;
	 System.out.println("Enter Total Amount:");
		total=input.nextDouble();
		
		double time;
		System.out.println("Enter Time:");
		time=input.nextDouble();
		double rate;
		System.out.println("Enter Rate:");
		rate=input.nextDouble();
		double interrest;
		interrest= total*time*rate;
		double  returned;
		returned  = total+ interrest;
		System.out.print("Interrest::\t");
		System.out.println(interrest);
		System.out.print("Money Returned::\t");
		System.out.println(returned);
		
	
	}
public static void loan ()
{
	Scanner receive=new Scanner(System.in);
	String names;
    double salary,loan,contact;
	System.out.println("Names:");
	names=receive.nextLine();
	System.out.println("Loan Amount you want:");
	loan=receive.nextDouble();
	System.out.println("Contact:");
	contact=receive.nextDouble();
	System.out.println("salary:");
	salary=receive.nextDouble();
	
}
 public static void manager()
 {
 Scanner receiver=new Scanner (System.in);
 String fname,sname,gender,address,status;
 double contact;
 System.out.println("fname:");
 fname=receiver.nextLine();
 System.out.println("sname:");
 sname=receiver.nextLine();
 System.out.println("gender:");
 gender=receiver.nextLine();
 System.out.println("address:");
 address=receiver.nextLine();
 System.out.println("status:");
 status=receiver.nextLine();
 System.out.println("Contacts:");
 contact=receiver.nextDouble();

 }
 
 {
	 
	 
 }

	public static void main (String args[]){
		
		int a=5;
		int b=0;
		try{
			
		int c=a/b;
		}
		catch(ArithmeticException e)
		{
		System.out.println("Cant Compute");

		
		}
		
		mothodes call=new mothodes();
		Scanner choice=new Scanner(System.in);
		int as;
		System.out.println("1.Interest");
		System.out.println("2.Loan");
		as=choice.nextInt();
		switch(as)
		{
				case 1:
				call.interest();
				break;
				
			case 2:
				call.loan();
				break;
			case 3:
				call.manager();
				break;
			
			default:
				System.out.println("Not Listed! Plz Try Later....");
				break;
		}
		
		
}
}