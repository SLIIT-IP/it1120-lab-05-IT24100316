import java.util.Scanner;

public class IT24100316Lab5Q1 {
   public static void main(String[]args){
	
//define variables
	int num1,num2,num3;

//create scanner
	Scanner num = new Scanner(System.in);

//take userinput
	System.out.println("Enter the first integer :");
	num1 = num.nextInt();
	
	System.out.println("Enter the second integer :");
	num2 = num.nextInt();

	System.out.println("Enter the second integer :");
	num3 = num.nextInt();

//print use inputs
   System.out.println("user enterd numbers are : "+num1+" "+num2+" "+num3);

//calculation
	if(num1>num2 && num1>num3)
		{System.out.println("The Larger number is : "+num1);}
	else if(num2>num1 && num2>num3)
		{System.out.println("The Larger number is : "+num2);}
	else 
		{System.out.println("The Larger number is : "+num3);}

	if(num1<num2 && num1<num3)
		{System.out.println("The Smaller number is : "+num1);}
	else if(num2<num1 && num2<num3)
		{System.out.println("The Larger number is : "+num2);}
	else
		{System.out.println("The Larger number is : "+num3);}
   }
}