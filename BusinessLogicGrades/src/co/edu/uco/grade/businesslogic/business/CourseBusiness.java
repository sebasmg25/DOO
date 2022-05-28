package co.edu.uco.grade.businesslogic.business;

import java.util.List;

import co.edu.uco.grades.dto.CourseDTO;

public interface CourseBusiness {
	void create(CourseDTO dto);
	void update(CourseDTO dto);
	void delete(int id);
	List<CourseDTO> find(CourseDTO dto);

}
