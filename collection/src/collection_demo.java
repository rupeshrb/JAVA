import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class collection_demo {
	public static void main(String[] args) {
		 List <Integer>li =new ArrayList<Integer>(); //list
		 
		 
		 //Integer a=new Integer(10);
		// li.add(a);
		 li.add(100);// add some value into collection object
		 li.add(200);
		// li.add("java");
		 //li.add(12.75);
		 li.add(60);
		 li.add(23);
		 
		 li.add(1,500);// 1 is index value to store in list
		 
		 List<Integer>l2=new ArrayList<Integer>();
		 l2.add(1000);
		 l2.addAll(li);
		 
		 System.out.println("using iterator of l2");
		 System.out.println(l2);
		 
		 Iterator itr =l2.iterator();
		 //looping thru the elements
		 while(itr.hasNext())
			 System.out.println(itr.next());
		 
		 //mostly used
		 System.out.println("using for each object of li");
		 System.out.println(li);
		 for(Integer i:li)
			 System.out.println(i);
		 
		 //length of collection by using size();
		 System.out.println("Length of an object are l2  "+l2.size() );
		 System.out.println("Length of an object are li  "+li.size() );
	
		 //clear off all elements in the collection
		 l2.clear();
		 System.out.println("l2 clear  "+l2);
	}
}
 	