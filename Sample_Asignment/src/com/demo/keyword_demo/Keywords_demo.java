package com.demo.keyword_demo;

public class Keywords_demo {
	
	public Keywords_demo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void Display_Keyword() {
		System.out.println("Java Reserved Keywords");
		System.out.println("Java has a set of keywords that are reserved words that cannot be used as \n variables, methods, classes, or any other identifiers:");
		System.out.println("\r\n"
				+ "abstract	continue	for	new	switch\r\n"
				+ "assert***	default	goto*	package	synchronized\r\n"
				+ "boolean	do	if	private	this\r\n"
				+ "break	double	implements	protected	throw\r\n"
				+ "byte	else	import	public	throws\r\n"
				+ "case	enum****	instanceof	return	transient\r\n"
				+ "catch	extends	int	short	try\r\n"
				+ "char	final	interface	static	void\r\n"
				+ "class	finally	long	strictfp**	volatile\r\n"
				+ "const*	float	native	super	while");
		System.out.println("Note: true, false, and null are not keywords, but they are literals and reserved words that cannot be used as identifiers.");
	}
}
