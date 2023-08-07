import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
public class Demo_ST {
	public static void main(String[] args) {
		FileReader fr;
		BufferedReader br;
		StringTokenizer st;
		try {
			fr=new FileReader("stud_data.txt");
			br=new BufferedReader(fr);
			String  data=br.readLine();
			while(data != null) {
				 st=new StringTokenizer(data,"#");
				 while(st.hasMoreElements()) {
					 String id=st.nextToken();
					 String name=st.nextToken();
					 String no=st.nextToken();
					 System.out.println("id is "+id+"\t"+"name is "+name+"\t"+"number"+no);
				 }
				 data=br.readLine();
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
