package co.edu.uco.grade.businesslogic.business.impl;

import java.util.List;

import co.edu.uco.crosscutting.util.object.UtilObject;
import co.edu.uco.grade.businesslogic.business.SessionBusiness;
import co.uco.grades.crosscuting.exception.GradesException;
import co.edu.uco.grades.data.factory.DAOFactory;
import co.edu.uco.grades.dto.SessionDTO;

	
	public class SessionBusinessImpl implements SessionBusiness {
		
		private DAOFactory daoFactory;
		
		public SessionBusinessImpl() {
			if(UtilObject.getUtilObject().isNull(daoFactory)) {
				throw GradesException.buildUserException("It's not possible create a SubjectBusinessImpl when DAoFactory is null");
			}
			
		}

		@Override
		public void create(SessionDTO dto) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void update(SessionDTO dto) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void delete(int id) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public List<SessionDTO> find(SessionDTO dto) {
			// TODO Auto-generated method stub
			return null;
		}

}
