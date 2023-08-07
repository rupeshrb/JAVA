public class FundsCollection {

public static void main(String[]args){
    // TODO Auto-generated method stub
	FundsCollected fci1 =new FundsCollected("shahil",100);
	FundsCollected fci2 =new FundsCollected("atharva",200);
	FundsCollected fci3 =new FundsCollected("pattar",100);
	FundsCollected fci4 =new FundsCollected("gopal",100);
	FundsCollected fci5 =new FundsCollected("satyajit",200);
	FundsCollected fci6 =new FundsCollected("rupesh",100);
	System.out.println(FundsCollected.gettotfounds());
}
}
	class FundsCollected{
	    String stdName;
	    int amount;
	  private static int totalFundsCollected=0;
		       
	    FundsCollected(String name,int amt){
	        stdName=name;
	        amount=amt;
	        totalFundsCollected+=amt;
	   }
	    static int gettotfounds() {
	    	//System.out.println(stdName);
	    	return totalFundsCollected;
	    }
}