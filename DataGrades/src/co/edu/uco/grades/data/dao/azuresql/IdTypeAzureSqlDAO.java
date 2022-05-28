package co.edu.uco.grades.data.dao.azuresql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import co.uco.grades.crosscuting.exception.GradesException;
import co.edu.uco.grades.data.dao.IdTypeDAO;
import co.edu.uco.grades.data.dao.connection.ConnectionSQL;
import co.edu.uco.grades.dto.IdTypeDTO;
	
	public class IdTypeAzureSqlDAO extends ConnectionSQL implements IdTypeDAO {

		private IdTypeAzureSqlDAO(Connection connection) {
			super(connection);
		}
		
		public static IdTypeDAO build(Connection connection) {
			return new IdTypeAzureSqlDAO(connection);
		}

		@Override
		public void create(IdTypeDTO idType) throws Exception {
			String sql = "INSERT INTO Stundent(idNumber, idType, name, email) VALUES(?,?,?,?)";
			
			try(PreparedStatement preparedStatement = getConnection().prepareStatement(sql)){
				preparedStatement.setString(1, idType.getName());
				preparedStatement.setInt(2, idType.getId());
			}catch (SQLException exception){
				
				throw GradesException.buildTechnicalException("There was a problem trying to create a new studend registry on sql server", exception, null);
				
			}catch (Exception exception) {
				
				throw GradesException.buildTechnicalDataException("There was an unexpected problem trying to create a new studend registry on sql server", exception);
				
			}
			
		}

		@Override
		public void update(IdTypeDTO idType) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void delete(int id) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public
		List<IdTypeDTO> find(IdTypeDTO idType) {
			return null;
			// TODO Auto-generated method stub
			
		}


}
