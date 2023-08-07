import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Read_demo {
	public static void main(String[] args) {
		FileReader fr;
		BufferedReader br;
		StringTokenizer st_u;
		try {
			fr=new FileReader("stud_data.txt");
			br =new BufferedReader(fr);
			String data=br.readLine();
			while(data != null) {
				 st_u=new StringTokenizer(data,"#");
				 while(st_u.hasMoreElements()) {
					 String id=st_u.nextToken();
					 String name=st_u.nextToken();
					 String nu=st_u.nextToken();
					 String det=st_u.nextToken();
					 System.out.println("id = "+id);
//					 id_F=Integer.parseInt(id);
//					 id_F =id_F+1;			 
				 }
				data=br.readLine();
				}
			}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		}
	}

