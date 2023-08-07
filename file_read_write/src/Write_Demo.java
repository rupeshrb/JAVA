import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.InputStreamReader;
public class Write_Demo {
	public static void main(String[] args) {
		FileWriter fw=null;
		BufferedReader br;
		try {
			fw=new FileWriter("stud_data.txt",true);
			br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter your id :- ");
			int id=br.read();
			System.out.println("enter your id :- ");
			String name=br.readLine();
			//write data into the text file
			fw.write(id);
			fw.write("#");
			fw.write(name);
			fw.write(id);
			fw.write("\n");	  
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				
				fw.close();
				System.out.println("\n \n\t**** Your Data has been Recorded ****");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
