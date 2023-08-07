 																																																																																																																																																																																																																																																																																																																																																																																																																																public class ProcessStud {
	
	public ProcessStud() {
		
	}
	int getTotmks(Capture_data sd) {
		
		int t1=sd.mks_csc+sd.mks_mm;
		return(t1);
	}
	
	 float avg(Capture_data sd) {
	
		// TODO Auto-generated method stub
		float total=getTotmks(sd);
		return(total/2);
	}
	 
	 String get_result(Capture_data sd) {
		 
		 float total=avg(sd);
		
		 if(total>=35) {
			 return "Pass";
		 }
		 else {
			 return "fail";
		 }
	 }
	 
	 String grade(Capture_data sd){
		 float total=avg(sd);
		 
		 if(total>90) {
			 return"A+ grade";
		 }
		 else if(total>80) {
			 return"A grade";
		 }
		 else if(total>70) {
			 return"B grade";
		 }
		 else if(total>60) {
			 return"C grade";
		 }
		 else if(total>50) {
			 return"D grade";
		 }
		 else {
			 return"E";
		 }
	 }
}



