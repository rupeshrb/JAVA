package com.student_marks;

public class Calculate {

	Stud_data sd;

	public Calculate(Stud_data sd) {
		super();
		this.sd = sd;
	}

	public Calculate() {
		super();
		// TODO Auto-generated constructor stub
	}
	int get_total() {
		return sd.math+sd.science;
	}

	@Override
	public String toString() {
		return "Calculate [sd=" + sd + "]";
	}
}
