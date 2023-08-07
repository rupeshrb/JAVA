public class Multi {
	public static void main(String[] args) {

		System.out.println("Multiplication  By Argument Value");
		
		int value = Integer.parseInt(args[0]); //convert string to number and access the arg value by indexing
		
		for(int i=1; i<=10; i++) {
				
				System.out.println(value+" * "+i+" = "+value *i);
			}
		
}

}
