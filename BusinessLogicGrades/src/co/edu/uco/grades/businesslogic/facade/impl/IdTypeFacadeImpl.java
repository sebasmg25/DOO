package co.edu.uco.grades.businesslogic.facade.impl;

import java.util.List;

import co.edu.uco.grade.businesslogic.business.IdTypeBusiness;
import co.edu.uco.grade.businesslogic.business.impl.IdTypeBusinessImpl;
import co.edu.uco.grades.businesslogic.facade.IdTypeFacade;
import co.uco.grades.crosscuting.exception.GradesException;
import co.edu.uco.grades.data.factory.DAOFactory;
import co.edu.uco.grades.dto.IdTypeDTO;

public class IdTypeFacadeImpl implements IdTypeFacade{
	
	private DAOFactory daoFactory = DAOFactory.getDaoFactory();

	@Override
	public void create(IdTypeDTO dto) throws Exception {
		DAOFactory daoFactory = DAOFactory.getDaoFactory();
		
		try {
			daoFactory.initTransaction();
			
			IdTypeBusiness idTypeBusiness = new IdTypeBusinessImpl(daoFactory);
			idTypeBusiness.create(dto);
			
			daoFactory.commitTransaction();
		}catch (GradesException exception) {
			daoFactory.rollbackTransaction();
			throw exception;
		}catch (Exception exception) {
			daoFactory.rollbackTransaction();
			var message = "There was a problem trying to create a new IdType on create";
			throw GradesException.buildTechnicalDataException(message);
		}finally {
			daoFactory.closeConnection();
		}
		
		
	}

	@Override
	public void update(IdTypeDTO dto) throws Exception {
		try {
			daoFactory.initTransaction();
			
			IdTypeBusiness idTypeBusiness = new IdTypeBusinessImpl(daoFactory);
			idTypeBusiness.update(dto);
			
			daoFactory.commitTransaction();
		}catch (GradesException exception) {
			daoFactory.rollbackTransaction();
			throw exception;
		}catch (Exception exception) {
			daoFactory.rollbackTransaction();
			var message = "There was a problem trying to update a new IdType on update";
			throw GradesException.buildTechnicalDataException(message);
		}finally {
			daoFactory.closeConnection();
		}
		
	}

	@Override
	public void delete(int id) throws Exception {
		try {
			daoFactory.initTransaction();
			
			IdTypeBusiness idTypeBusiness = new IdTypeBusinessImpl(daoFactory);
			idTypeBusiness.delete(id);
			
			daoFactory.commitTransaction();
		}catch (GradesException exception) {
			daoFactory.rollbackTransaction();
			throw exception;
		}catch (Exception exception) {
			daoFactory.rollbackTransaction();
			var message = "There was a problem trying to delete a new IdType on create";
			throw GradesException.buildTechnicalDataException(message);
		}finally {
			daoFactory.closeConnection();
		}
		
	}

	@Override
	public List<IdTypeDTO> find(IdTypeDTO dto) throws Exception {
		try {
			daoFactory.initTransaction();
			
			IdTypeBusiness idTypeBusiness = new IdTypeBusinessImpl(daoFactory);
			return idTypeBusiness.find(dto);
			
		}catch (GradesException exception) {
			daoFactory.rollbackTransaction();
			throw exception;
		}catch (Exception exception) {
			var message = "There was a problem trying to create a new IdType on create";
			throw GradesException.buildTechnicalDataException(message);
		}finally {
			daoFactory.closeConnection();
		}
	}
	
}
