import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.lang.String;;
 


public class reader {

	public static void main(String[] args) {
		
/*		  System.out.println("2 wrd: "   );		   
		  System.out.println("1 wrd: "   );
		
		   */
		
		//Open the file for reading

		String thisLine;
		class loanrec {
			public String RecordType;
			public String Action;
			public String LoanNumber;
			public String Name1;
			public String Fname1;
			public String Name2;
			public String Fname2;
			public String Address1;
			public String Address2;
			public String City;
			public String State;
			public String ZipCode;
			public String Phone;
			public String Salutation;
			public String Branch;
			public String Division;
			public String Misc;
			public String Officer;
			public Date LoanDate;
			public Date MaturityDate;
			public Date PaidDate;
			public String Balance;
			public String CIFNumber;
			public String HoldNoticeFlag;
			public String collCode;
			public String collDescription;
			public String trackCode;
			public String filler;
			}
/*			Note that the static keyword also disappears in records. To use it in the program, you have to define a variable of that type just like you did in Pascal:

			myrec mydata;*/
 
		loanrec loanData;
		
		BufferedReader br = null;
		try {
			

	   	// reading a file using BufferedReader class..
		       
		    String temp = "c:/temp/tts1342.dsk";
			// BufferedReader
		    //  br = new BufferedReader(new FileReader(context.input));
		     br = new BufferedReader(new FileReader(temp));  
		    
		    Boolean loanSt;
		    loanSt = false;
		    
		    int recCnt = 0;
		    
		    
			while((thisLine=br.readLine())!=null) {
		 
				if (recCnt == 5) recCnt = 0; 
				
				if ( thisLine.substring(0,1).contains("g") ) loanSt = false;
				
				else
					
		    	if ( thisLine.substring(0,1).contains("A") && recCnt == 0 )  {loanSt = true;
			     // recCnt = 1;
			    
			     System.out.println(thisLine.substring(1,20));

		    	 }
			
			     if (loanSt){
			    	 recCnt = recCnt + 1;
			    	
			    	 
			    	 
			     }
			
/*		        if ( loanSt ) {
		        	
		        	switch (recCnt) {
					case 1:
						
						break;

					default:
						break;
					}
		        	
		        	
		        }
			*/
		    	 
		    	// thisLine = br.readLine();
		    	// System.out.println(thisLine);

		}
			
		}// end try
		    catch (IOException e) {
		      System.err.println("Error: " + e);
		       }
		     finally {
					try {
						if ( br != null)br.close();
					} catch (IOException ex) {
						 System.err.println("Error: " + ex);
					}
				}
		  
	  
	
}
	
}

