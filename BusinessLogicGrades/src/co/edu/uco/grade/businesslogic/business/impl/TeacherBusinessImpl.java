package co.edu.uco.grade.businesslogic.business.impl;

import java.util.List;

import co.edu.uco.crosscutting.util.object.UtilObject;
import co.edu.uco.grade.businesslogic.business.TeacherBusiness;
import co.uco.grades.crosscuting.exception.GradesException;
import co.edu.uco.grades.data.factory.DAOFactory;
import co.edu.uco.grades.dto.TeacherDTO;

	
	public class TeacherBusinessImpl implements TeacherBusiness {
		
		private DAOFactory daoFactory;
		
		public TeacherBusinessImpl() {
			if(UtilObject.getUtilObject().isNull(daoFactory)) {
				throw GradesException.buildUserException("It's not possible create a SubjectBusinessImpl when DAoFactory is null");
			}
			
		}

		@Override
		public void create(TeacherDTO dto) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void update(TeacherDTO dto) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void delete(int id) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public List<TeacherDTO> find(TeacherDTO dto) {
			// TODO Auto-generated method stub
			return null;
		}

}
