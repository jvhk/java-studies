package app;

import models.dao.DAOFactory;
import models.dao.SellerDAO;
import models.entities.Seller;

public class Program {
	public static void main(String[] args) {
		
		SellerDAO sellerDao = DAOFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findbyID ===");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
	}
}
