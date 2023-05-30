package MindReader;
import java.util.*;
public class MindReaderCode {
	public static void main(String agr[])
	{
		  int n;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the 7th Number : ");
		  n = sc.nextInt();
		  MindRead(n);
	}
	public static void MindRead(int n)
	{
		int digit=0;
		   int  FirstDigit ,MiddleDigit,LastDigit  ;


		   int CopyNumber = n;
		       while(n>=1)
		       {
		              n/=10;
		              digit++;
		       }

		    FirstDigit = CopyNumber/10;//Leave the last digit...

		    LastDigit = CopyNumber %10;

		    MiddleDigit = FirstDigit+LastDigit;
		    // For negative number :
		   //FirstDigit will show negative sign we don't need to specify it separately but we need to remove negative sign from MiddleDigit
		   if(MiddleDigit<0)
		   {
		     MiddleDigit = MiddleDigit*-1;//It will make it positive.
		   }



		    if(MiddleDigit>9)
		    {
		       int MidDigit = MiddleDigit%10;
		       FirstDigit = FirstDigit + (MiddleDigit/10);
		       System.out.printf(" Your Sum is : %d%d%d",FirstDigit , MidDigit,LastDigit);
		      
		    }
		    else
		    {
		        System.out.printf("Your Sum is : %d%d%d",FirstDigit , MiddleDigit,LastDigit);  
		    	
		    }

	}

}


