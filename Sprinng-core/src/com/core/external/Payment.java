package com.core.external;

public class Payment {
//declaring interface as property 
	Card cd;

	@Override
	public String toString() {
		return "Payment [cd=" + cd + "]";
	}

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setCd(Card cd) {
		this.cd = cd;
	}
	public void payment(String cardNo,float amt) {
		if(cd.verify(cardNo)) {
			System.out.println("payment succesfull " +amt);
		}
	}
	
	
}
