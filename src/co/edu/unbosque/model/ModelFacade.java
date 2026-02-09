package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.CrepeDAO;
import co.edu.unbosque.model.persistence.HeladoDAO;
import co.edu.unbosque.model.persistence.WaffleDAO;

public class ModelFacade {
	private HeladoDAO heladoDao;
	private CrepeDAO crepeDao;
	private WaffleDAO waffleDao;
	
	public ModelFacade() {
		heladoDao = new HeladoDAO();
		crepeDao = new CrepeDAO();
		waffleDao = new WaffleDAO();
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

	public WaffleDAO getWaffleDao() {
		return waffleDao;
	}

	public void setWaffleDao(WaffleDAO waffleDao) {
		this.waffleDao = waffleDao;
	}
	
	
}
