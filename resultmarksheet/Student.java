package education;

public class Student implements Exam,Grade{
	String name;
	String sub[];
	int marks[];
	int total=0;
	int avg;
	String result="Pass";
	String g;
	
	Student(String name,String sub[],int marks[]){
		this.name=name;
		this.sub=sub;
		this.marks=marks;
		
		
		for(int i=0;i<marks.length;i++){
			total=total+marks[i];
			
			if(marks[i]<35){
				result="Fail";
			}
		}
		avg=total/marks.length;
		
		g=grade(avg);
	}
	
	public int marks(){
		return total;
	}
	
	public String grade(int avg){
		if(avg>=75)
			return "A";
		
		else if(avg >= 60)
            return "B";

        else if(avg >= 50)
            return "C";

        else if(avg >= 35)
            return "D";

        else
            return "F";
	}
	
	public String toString(){
		String data="\nStudent name:"+name;
		
		data+="\n\nSubject marks";
		for(int i=0;i<marks.length;i++){
			data+="\n"+sub[i]+":"+marks[i];
		}
		
		data+="\n\nTotal:"+total;
		data+="\nAverage:"+avg;
		data+="\nGrade:"+g;
		data+="\nResult:"+result;
		
		return data;
	}
}