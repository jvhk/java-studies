package app;

import java.util.List;

import models.dao.DAOFactory;
import models.dao.SellerDAO;
import models.entities.Department;
import models.entities.Seller;

public class Program {
	public static void main(String[] args) {
		
		SellerDAO sellerDao = DAOFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findbyID ===");
		Seller seller = sellerDao.findById(3);		
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller findbyByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
	}
}
