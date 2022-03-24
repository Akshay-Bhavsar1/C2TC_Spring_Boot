package com.tns.di;

public class Student {

	private MathCheat chit;
	
//	Dependency injection using Setter injection
	public void setChit(MathCheat chit) {
		this.chit = chit;
	}

	public void cheating()
	{
		chit.mathCheat();
	}
}
