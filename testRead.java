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
