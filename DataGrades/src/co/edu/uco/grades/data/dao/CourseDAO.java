package co.edu.uco.grades.data.dao;

import co.edu.uco.grades.dto.CourseDTO;

public interface CourseDAO {

	void create (CourseDTO course) throws Exception;
	void delete (int id);
	void find (CourseDTO course);
	
}
