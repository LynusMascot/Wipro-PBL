
//Coder: Rohit Goswami

/*Write a Program that accepts two Strings as command line arguments and generate the output in a specific way as given below.

Example:

If the two command line arguments are Wipro and Bangalore then the output generated should be Wipro Technologies Bangalore.

If the command line arguments are ABC and Mumbai then the output generated should be ABC Technologies Mumbai 

[Note: It is mandatory to pass two arguments in command line]
*/
public class Main
{
	public static void main(String[] args) {
     if(args.length>0){
         String a= args[0];
         String b= args[1];
         System.out.println(a+" Technologies "+b);
     }
     else{
         System.out.println("Error: Not enough arguments");
     }
        
	}
}
