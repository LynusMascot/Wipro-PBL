
//Coder: Rohit Goswami
 
 /* Write a Program to accept a String as a Command line argument and the program should print a Welcome message.

Example :

     C:\> java Sample John
    
      O/P Expected : Welcome John
*/
public class Main
{
	public static void main(String[] args) {
     if(args.length>0){
         String a= args[0];
         
         System.out.println("Welcome "+ a);
     }
     else{
         System.out.println("Error: Not enough arguments");
     }
        
	}
}
