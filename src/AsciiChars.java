
public class AsciiChars 
{

	public static void printNumbers()
	   {
	   		int startIndex = 0;
	   		int endIndex = 10;
	   		
			for (int i = startIndex; i <= endIndex; i++) {
		    	System.out.println(i);
			}
	   }
	   
	   public static void printLowerCase()
	   {
	   		char startIndex = 'a';
	   		char endIndex = 'z';
	   		
			for (char i = startIndex; i <= endIndex; i++) {
		    	System.out.println(i);
			}
	   }
	   
	   public static void printUpperCase()
	   {
	   		char startIndex = 'A';
	   		char endIndex = 'Z';
	   		
			for (char i = startIndex; i <= endIndex; i++) {
		    	System.out.println(i);
			}
	   }
		
	   public static void main (String[] args) throws java.lang.Exception
		{
			printNumbers();
			printUpperCase();
			printLowerCase();
			
		}
	}