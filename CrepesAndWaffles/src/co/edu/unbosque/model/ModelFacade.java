package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.CrepeDAO;
import co.edu.unbosque.model.persistence.HeladoDAO;

public class ModelFacade {
	private HeladoDAO heladoDao;
	private CrepeDAO crepeDao;
	
	public ModelFacade() {
		heladoDao = new HeladoDAO();
		crepeDao = new CrepeDAO();
	}

	public HeladoDAO getHeladoDao() {
		return heladoDao;
	}

	public void setHeladoDao(HeladoDAO heladoDao) {
		this.heladoDao = heladoDao;
	}

	public CrepeDAO getCrepeDao() {
		return crepeDao;
	}

	public void setCrepeDao(CrepeDAO crepeDao) {
		this.crepeDao = crepeDao;
	}
	
	
}
