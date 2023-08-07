package com.demo.interface_demo;

public class DemoesticElecBilling_Impl implements Interface {
	int conID;
	String conNAME;
	public DemoesticElecBilling_Impl(int conID, String conNAME) {
		super();
		this.conID = conID;
		this.conNAME = conNAME;
	}

	int totCHG;
	
	@Override
	public int calcBilling(int units) {
		// TODO Auto-generated method stub
		if (units >= 0 && units <= 50) 
			totCHG += getZ_50(units);
		else if (units >= 51 && units <= 100)	
			totCHG += get_51_100(units);
		else
			totCHG += get_GT_100(units);
		
		return totCHG;
	}
	int getZ_50(int unit) {
		int sub=0;
		sub+=unit * UC_Z_50;
		return sub;
	}
	int get_51_100(int unit) {
		int sub=0;
		sub+=getZ_50(50);
		int temp = unit -50;
		sub+=temp*UC_51_100;
		return sub;
	}
	int get_GT_100(int unit) {
		int sub=0;
		sub+=get_51_100(100);
		int temp = unit -100;
		sub+=temp*UC_GT_100;
		return sub;
	}

}
