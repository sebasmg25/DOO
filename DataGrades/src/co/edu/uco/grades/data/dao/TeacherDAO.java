package co.edu.uco.grades.data.dao;

import co.edu.uco.grades.dto.TeacherDTO;

public interface TeacherDAO {
	
	void create(TeacherDTO teacher) throws Exception;
	void update (TeacherDTO teacher);
	void delete (int id);
	void find (TeacherDTO teacher);

}
