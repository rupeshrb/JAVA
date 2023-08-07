package com.core.external;

public class MasterCard implements Card {

	@Override
	public boolean verify(String cardNo) {
		// TODO Auto-generated method stub
		System.out.println("master card verification complete");
		return true;
	}

}
