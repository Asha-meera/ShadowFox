import java.util.*;
public class Calc {
	static Scanner sc=new Scanner(System.in);
	
	    
	     public static void arithmeticOperations()//method name should write in camelcase
	 	{
	 	   
	 	    System.out.println("Enter your first number");
	 	    int num1=sc.nextInt();
	 	    System.out.println("Enter your Second number");
	 	    int num2=sc.nextInt();
	 	    System.out.println("Enter your choice '+','-','*','/' ");
	 	    char ch=sc.next().charAt(0);
	 	    
	 	    switch(ch)
	 	    {
	 	        case '+': 
	 	                  System.out.println("Addition of two numbers :"+(num1+num2));
	 	                   break;
	 	        case '-': 
	 	                  System.out.println("Subtraction of two numbers :"+(num1-num2));
	 	                   break;
	 	        case '*': 
	 	                  System.out.println("Multiplication of two numbers :"+(num1*num2));
	 	                   break;
	 	        case '/': 
	 	                 try
	 	                  {
	 	                      System.out.println("Division of two numbers :"+(num1/num2));
	 	                   break;
	 	                  }
	 	                   catch(Exception e)
	 	                  {
	 	                     e.printStackTrace();
	 	                  }
	 	                  break;
	 	        default : 
	 	                  System.out.println("Invalid operations");
	 	       
	 	    }
	 	}
	
	     public static void scientificOperation()
	 	{
	 	   
	 	    System.out.println("Enter your choice 1.square root  2: Exponential");
	 	    int n=sc.nextInt();
	 	    switch(n)
	 	    {
	 	        case 1:
	 	                 System.out.println("Enter your number");
	 	                 int number=sc.nextInt();
	 	                 if (number<0)
	 	                 {
	 	                     System.out.println("Cannot calculate Negative Numbers");
	 	                 }
	 	                 else
	 	                 {
	 	                      System.out.println("Square root of number is :"
	 	                      +Math.sqrt(number));
	 	                 }
	 	               break;
	 	       case 2:
	 	                System.out.println("Enter your base");
	 	                int base=sc.nextInt();
	 	                System.out.println("Enter your Exponent");
	 	                int exponent=sc.nextInt();
	 	                System.out.println("Exponential of this number :"+
	 	                Math.pow(base,exponent));
	 	                break;
	 	       default:
	 	                System.out.println("Invalid Choice");
	 	    }
	 	    
	 	    
	 	}
	 	public static void unitConversion()
	 	{
	 	    
	 	    System.out.println("Enter your choice  1.convert celsius to farenheit  2.conevrt Farenheit to celsius  3:usd to eur 4.eur to usd");
	 	    int n=sc.nextInt();
	 	    switch (n)
	 	    {
	 	         case 1:
                         System.out.println("Enter celsius ");
	 	                 float celsius=sc.nextFloat();
	 	                 int farenheit=(int)celsius*(9/5)+32;
	 	                 System.out.println("farenheit of the given number is :"+farenheit
	 	                 );
	 	                  break;
	 	         
                case 2:
                          System.out.println("Enter farenheit ");
                           int  F=sc.nextInt();
                          float C = (F - 32)/(float)1.8;
                           System.out.println("celsius of the given number is :"+C);
                           
                            break;
                case 3:
                            System.out.println("Enter the amount in usd");
                            double usd=sc.nextDouble();
                            double eur=usd*0.85;
                            System.out.println("Amount in Eur: "+eur);
                            break;
                 case 4:
                            System.out.println("Enter the amount in eur");
                            double euro=sc.nextDouble();
                            double usD=euro*1.07635;
                            System.out.println("Amount in usD: "+usD);
                            break;
	 	         default:
	 	                 System.out.println("Invalid choice");
	 	                 
	 	    }
	 	}
	 	public static void main(String[] args) {
			
            System.out.println("welcome to the console Calculator");
			boolean option=true;
            while(option)
            {
	    
			System.out.println("Enter your choice 1: Arithmetic operations");
			System.out.println("2: Scientific calculation");
			System.out.println("3: Unit conversion");
		    System.out.println("4: Exit");
		    int n=sc.nextInt();//given the choice input number
		     switch(n)
		     {
		         case 1: 
		                 arithmeticOperations();
		                 break;
		         case 2:
		                 scientificOperation();
		                 break;
		         case 3:
		                 unitConversion();
		                 break;
		         case 4: 
                        option=false;
		                System.out.println("Thank you for using Calculator");
		                 break;
		         default:
		                  System.out.println("Invalid choice");
		               
		     }
            }
		}
	}