package collectioninjava;

import java.util.Comparator;

public class StudentDeptComparator implements Comparator<Student1> {

	@Override
	public int compare(Student1 s1, Student1 s2) {
		// TODO Auto-generated method stub
		if(s1.dept.equals(s2.dept))
			
			return s1.id-s2.id;
		else
			
			return s1.dept.compareTo(s2.dept);
	}
	

}
