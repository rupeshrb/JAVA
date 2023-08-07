
public class DemoStudMain {

	      public static void main(String[]args){
	         
	    	  // TODO Auto-generated method stub
	         Capture_data roop =new Capture_data(1,"roopesh",80,60);
	         ProcessStud ps=new ProcessStud();
	         
	         // invoking the method
	         int totMks = ps.getTotmks(roop);
	         float avg = ps.avg(roop);
	         String result =ps.get_result(roop);
	         String grade =ps.grade(roop);
	        
	         System.out.println("tot mks is ="+totMks);
	         System.out.println("Avg ="+avg);
	         System.out.println("result ="+result);
	         System.out.println("grade ="+grade);
	         
}}
