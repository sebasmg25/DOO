package co.edu.uco.grades.data.factory;

import java.sql.Connection;

import co.edu.uco.grades.data.dao.StudentDAO;
import co.edu.uco.grades.data.factory.azuresql.AzureSqlDAOFactory;

public abstract class DAOFactory {
	
	public static DAOFactory getDaoFactory() {
		return AzureSqlDAOFactory.create();
	}
	
	protected abstract void openConnection() throws Exception;
	
	protected abstract Connection getConnection();
	
	public abstract void initTransaction() throws Exception;
	
	public abstract void closeConnection();
	
	public abstract void rollbackTransaction() throws Exception;
	
	public abstract void commitTransaction() throws Exception;
	
	public abstract StudentDAO getStudentDAO();
	
}
