import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class demo_sec {

	public static void main(String[] args)  {
		FileReader fr;
		FileWriter fw=null;
		BufferedReader br;
		StringTokenizer st;
		int id_F=0;
		try {
			fr=new FileReader("stud_data.txt");
			br=new BufferedReader(fr);
			int i=0;
			String  data=br.readLine();
			while(data != null) {
				 st=new StringTokenizer(data);
				 while(st.hasMoreElements()) {
					 String id=st.nextToken();
					 System.out.println("id is "+id);
					 id_F=Integer.parseInt(id);
					 id_F =id_F+1;			 
				 }
				 data=br.readLine();
			}
			try {
				fw=new FileWriter("stud_data.txt");
				br=new BufferedReader(new InputStreamReader(System.in));
			
				String ref_id_unique = String.valueOf(id_F);
				fw.write(ref_id_unique);
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			finally {
				try {
     				fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
