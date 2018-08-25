
//Coder : Rohit Goswami
/*
Write a Program to accept two integers through the command line 
argument and print the sum of the two numbers

Example:

     C:\>java Sample 10 20

     O/P Expected : The sum of 10 and 20 is 30
*/

public class Main
{
	public static void main(String[] args) {
     if(args.length>0){
         int a= Integer.parseInt(args[0]);
         int b= Integer.parseInt(args[1]);
         int sum=a+b;
         System.out.printf("Sum of %d and %d is %d",a,b,sum);
     }
     else{
         System.out.println("Error: Not enough arguments");
     }
        
	}
}
