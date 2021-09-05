package models.dao;

import models.dao.impl.SellerDaoJDBC;

public class DAOFactory {
	
	public static SellerDAO createSellerDao() {
		return new SellerDaoJDBC();
	}
}
