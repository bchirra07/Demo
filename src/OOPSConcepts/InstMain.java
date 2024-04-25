package OOPSConcepts;

public class InstMain {

	public static void main(String[] args) {
	  Institutions i=new Institutions();
	  i.schoolMethod();
	  i.collegeMethod();
	  
	  School s= new Institutions();
	  s.schoolMethod();
	  
	  HighSchool hs= new Institutions();
	  hs.highSchoolMethod();
	  hs.schoolMethod();
	  

	}

}
