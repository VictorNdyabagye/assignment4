package assignment4;
import java.util.Scanner;



public class grading_system {





	    public static void main(String args[])
	    {
	    	/* This program assumes that the student has 5 course units,
	    	 * thats why I have created the array of size 5. You can
	    	 * change this as per the requirement.
	    	 */
	        int marks[] = new int[5];
	        int i;
	        float total=0, avg;
	        Scanner scanner = new Scanner(System.in);
			
	        
	        for(i=0; i<5; i++) { 
	           System.out.print("Enter Marks of course unit"+(i+1)+":");
	           marks[i] = scanner.nextInt();
	           total = total + marks[i];
	        }
	        scanner.close();
	        //Calculating average here
	        avg = total/5;
	        System.out.print("The  Grade is: ");
	        if(avg>=85)
	        {
	            System.out.print("A. EXELENT");
	        }
	        else if(avg>=70 && avg<85)
	        {
	           System.out.print("B. NICE TRIAL");
	        } 
	        else if(avg>=60 && avg<69)
	        {
	            System.out.print("C");
	        }
	            else if(avg>=50 && avg<59)
		        {
		            System.out.print("D");
	        }
	        else
	        {
	            System.out.print("F.OHH SORRY TRY AGAIN NEXT SEMISTER");
	        }
	    }
	}



