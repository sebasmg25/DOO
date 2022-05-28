package co.edu.uco.grade.businesslogic.business;

import java.util.List;

import co.edu.uco.grades.dto.TeacherDTO;

public interface TeacherBusiness {
	
	void create(TeacherDTO dto);
	void update(TeacherDTO dto);
	void delete(int id);
	List<TeacherDTO> find(TeacherDTO dto);

}
