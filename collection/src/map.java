import java.util.HashMap;
import java.util.Map;

public class map {
	public static void main(String[] args) {
		
		Map<Integer,String> m =new HashMap<Integer,String>();
		
		m.put(1,"pune");
		m.put(2,"blr");
		m.put(1,"Pune");
		m.put(4,"shink");
		System.out.println("value is = "+m.get(1));
		System.out.println("size is ="+m.size());
		System.out.println("All keys = "+m.keySet());
		
		HashMap<Integer,String>m2=new HashMap<Integer,String>();
		m2.put(4, "apple");
		m2.put(20, "RB Group");
		m2.put(3, "banana");
		m2.putAll(m);
		System.out.println(m2);
		System.out.println(m);
		System.out.println(m2.entrySet());
	}
}
