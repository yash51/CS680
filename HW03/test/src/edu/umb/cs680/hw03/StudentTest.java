package edu.umb.cs680.hw03;

import static org.junit.Assert.assertArrayEquals;
import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw03.Student;
import edu.umb.cs680.hw03.StudentFactory;


class StudentTest {
	private String[] InStateStudentToStringArray(Student s){
		String[] StudentInfo = 
			{ 
				s.getName(), s.getUsAddr()
			};
		return StudentInfo;
		}
	
	private String[] OutStateStudentToStringArray(Student s){
			String[] StudentInfo = 
				{ 
					s.getName(), s.getUsAddr(), Integer.toString(s.getYrsInState())
				};
		return StudentInfo;
	}	
	
	private String[] IntlStudentToStringArray(Student s){
		String[] StudentInfo = 
			{ 
				s.getName(), s.getUsAddr(), Integer.toString(s.getI20num()), s.getForeignAddr()
			};
	return StudentInfo;
	}	
	
	@Test
	public void verify_In_state_student() {
		String[] expected = {"Derek", "Boston"};
		Student actual= StudentFactory.createInStateStudent("Derek", "Boston");
		assertArrayEquals(expected, InStateStudentToStringArray(actual));
	}

	@Test
	public void verify_Out_State_student() {
		String[] expected = {"Anna", "Boston", "123"};
		Student actual= StudentFactory.createOutStateStudent("Anna", "Boston", 123);
		assertArrayEquals(expected, OutStateStudentToStringArray(actual));
	} 
	
	@Test
	public void verify_Inl_student() {
		String[] expected = {"Yash", "Boston", "565622", "India"};
		Student actual= StudentFactory.createIntlStudent("Yash", "Boston", 565622, "India");
		assertArrayEquals(expected, IntlStudentToStringArray(actual));
	} 
}
