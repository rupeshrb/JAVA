
public class FrogCount {
	 public static void main(String[]args){
		 frog f1= new frog();
		 frog f2= new frog();
		 frog f3= new frog();
		 System.out.println(f1.frog_count());
		 System.out.println(frog.frog_count());
		// System.out.println(frog.count);

	 }
}
class frog{
	private static int count=0;
	frog(){
		++count;
	}
	static int frog_count() {
		return count; 
	
}
}
