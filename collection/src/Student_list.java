import java.util.ArrayList;
import java.util.List;

public class Student_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StudentData> li=new ArrayList<StudentData>();
		li.add(new StudentData(1,"java"));
		li.add(new StudentData(2,"spring"));
		li.add(new StudentData(3,"hibernate"));
		
		StudentData s1 =new StudentData(4,"advance");
		
		li.add(s1);
		for(StudentData i:li)
			System.out.println(i);
	}

}
class StudentData{
	int stdId;
	String stdName;
	@Override
	public String toString() {
		return "StudentData [stdId=" + stdId + ", stdName=" + stdName + "]";
	}
	public StudentData(){
		
	}
	public StudentData(int stdId, String stdName) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
	}
}