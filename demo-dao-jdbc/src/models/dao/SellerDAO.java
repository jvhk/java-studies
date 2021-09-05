package models.dao;

import java.util.List;

import models.entities.Seller;

public interface SellerDAO {
	void insert(Seller obj);
	void update(Seller obj);
	void delete(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
}
