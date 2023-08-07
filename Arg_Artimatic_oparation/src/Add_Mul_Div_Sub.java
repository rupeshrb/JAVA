
public class Add_Mul_Div_Sub {
	public static void main(String[] args) {

		System.out.println("Arthmatic Opration By Argument Value");
		int value1 = Integer.parseInt(args[0]);  //convert string to number and access the arg value by indexing
		int value2 = Integer.parseInt(args[1]);
		System.out.println("Argument value1 is= "+value1);
		System.out.println("Argument value2 is= "+value2);
		System.out.println("ADD = "+(value1+value2));
		System.out.println("MUL = "+(value1*value2));
		System.out.println("DIV = "+(value1/value2));
		System.out.println("SUB = "+(value1-value2));
	}
}
